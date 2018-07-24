package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.PageDistribute;
import cn.itcast.ssm.po.PageInf;
import cn.itcast.ssm.po.UserInf;
import cn.itcast.ssm.service.UserService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.*;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

/**
 * @author tyh
 * @Package cn.itcast.ssm.controller
 * @Description: userController
 * @date 2018/5/9 15:12
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Producer producer;

    /**
     * 生成图形验证码
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @ArchivesLog(operationName = "生成验证码",operationType = "用户基本操作")
    @GetMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        //生成文字验证码
        String text = producer.createText();
        System.out.println(text);
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到shiro session（注意：如果没有securityManager配置，则暂时无法工作，测试时先注释掉）
        ShiroUtils.setSessionAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        out.flush();
    }

    /**
     * 发送验证码2
     * @param session session2
     * 发送验证码2
     * @param map2 手机号
     * @return 是否发送成功
     */
    @ArchivesLog(operationName = "发送验证码",operationType = "用户基本操作")
    @ResponseBody
    @RequestMapping(value = "/sendCode.action",method = RequestMethod.POST)
    public Map<String ,Object> sendCode(HttpSession session, @RequestBody Map<String,Object> map2){
        Map<String ,Object> map=new HashMap<>();
        if(map2.get("tel")!=null&&!map2.get("tel").equals("")&&RegexUtil.checkPhone(String.valueOf(map2.get("tel")))){
            String tel=String.valueOf(map2.get("tel"));
            System.out.println("手机号为:"+map2.get("tel"));
            if(userService.findId(tel)==null){
                String[] str={"1","2","3","4","5","6","7","8","9","0"};
                String s="";
                for (int j = 0; j <6 ; j++) {
                    s+=str[(int)(Math.random()*(str.length))];
                }
                System.out.println(s);
                session.setAttribute("code",s);
                map.put("mark",true);
            }else{
                map.put("mark",false);
                map.put("msg","本号码已存在,");
            }
        }else{
            map.put("mark",false);
            map.put("msg","电话号码错误");
        }
        return map;
    }

    /**
     * 用户注册
     * @param user 用户信息
     * @param code 验证码
     * @param session session
     * @param response response
     * @return 界面
     */
    @ArchivesLog(operationName = "用户注册",operationType = "写入信息")
    @RequestMapping(value = "/register.action",method = RequestMethod.POST)
    public String register(UserInf user, String code, HttpSession session, HttpServletResponse response)throws UnsupportedEncodingException{
        if(session.getAttribute("code")!=null){
            if(code.equals(session.getAttribute("code"))){
                if(user.getUserid()!=null&&user.getPassword()!=null&&user.getTel()!=null){
                    if(RegexUtil.checkPassword(user.getPassword())){
                        user.setPassword(EncryptUtil.MD5ReEncrpt(user.getPassword()));
                        user.setRegtime(new Date());
                        if(userService.register(user)){
                            Cookie cookie = new Cookie("msg",URLEncoder.encode("注册成功!","UTF-8"));
                            cookie.setMaxAge(3600);
                            cookie.setPath("/PHM/html/public");
                            response.addCookie(cookie);
                            return "redirect:public/success.html";
                        }
                    }else{
                        Cookie cookie = new Cookie("msg",URLEncoder.encode("密码不符合规范!","UTF-8"));
                        cookie.setMaxAge(3600);
                        response.addCookie(cookie);
                    }
                }else{
                    Cookie cookie = new Cookie("msg",URLEncoder.encode("信息不完整!","UTF-8"));
                    cookie.setMaxAge(3600);
                    response.addCookie(cookie);
                }
            }else{
                Cookie cookie = new Cookie("msg",URLEncoder.encode("验证码错误!","UTF-8"));
                cookie.setMaxAge(3600);
                response.addCookie(cookie);
            }
        }else{
            Cookie cookie = new Cookie("msg",URLEncoder.encode("请验证手机!","UTF-8"));
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
        }
        return "redirect:/html/newuser.html";
    }

    /**
     * 修改信息
     * @param map 数据
     * @param session session
     * @return 值
     * @throws Exception 类型转换错误
     */
    @ArchivesLog(operationName = "用户修改信息",operationType = "更新信息")
    @RequestMapping(value = "/UserDate.action", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> UserDate(@RequestBody Map<String, Object> map, HttpSession session) throws Exception {
        String whatupdate = (String) map.get("title");
        if (whatupdate!=null&&whatupdate.equals("updateDate")) {
            Map<String, Object> map2 = (Map<String, Object>) map.get("data");
            String telph = (String) session.getAttribute("id");
            String email = (String) map2.get("email");
            if(RegexUtil.checkEmail(email)){
                String nic = (String) map2.get("nic");
                if(nic.length()<=6){
                    String name = (String) map2.get("name");
                    if(RegexUtil.checkUserName(name)){
                        userService.uadatedate(  name, nic,email ,telph);
                        UserInf user=(UserInf) session.getAttribute("user");
                        user.setEmail(email);
                        user.setName(name);
                        user.setUserid(nic);
                        Map<String, Object> map3 = new HashMap<>();
                        map3.put("data", "success");
                        return map3;
                    }
                }
            }
        } else if (whatupdate!=null&&whatupdate.equals("updatePwd")) {
            Map<String, Object> map2 = (Map<String, Object>) map.get("data");
            String oldPwd = (String) map2.get("oldPass");
            String telph = (String) session.getAttribute("id");
            if (!((UserInf)session.getAttribute("user")).getPassword().equals(EncryptUtil.MD5ReEncrpt(oldPwd))) {
                System.out.println("密码错误");
                Map<String, Object> map3 = new HashMap<>();
                map3.put("data", "error");
                return map3;
            } else {
                System.out.println("密码正确");
                Map<String, Object> map4 = (Map<String, Object>) map.get("data");
                String newpass = (String) map4.get("newpass");
                if(RegexUtil.checkPassword(newpass)){
                    userService.updatepw(EncryptUtil.MD5ReEncrpt(newpass),telph);
                    ((UserInf)session.getAttribute("user")).setPassword(EncryptUtil.MD5ReEncrpt(newpass));
                    Map<String, Object> map3 = new HashMap<>();
                    map3.put("data", "success");
                    return map3;
                }else{
                    Map<String, Object> map3 = new HashMap<>();
                    map3.put("data", "error");
                    return map3;
                }
            }
        }
        else if(whatupdate == null){
        	 String telph = (String) session.getAttribute("id");
        	 String email =(String) map.get("email");
            if (RegexUtil.checkEmail(email)){
                String name =(String) map.get("name");
                if(RegexUtil.checkUserName(name)){
                    String idnumber =(String) map.get("idnumber");
                    if(RegexUtil.checkIdNumber(idnumber)){
                        userService.adddata(email,name,idnumber,telph);
                        Map<String, Object> map2 = new HashMap<>();
                        map2.put("indexData", "true");
                        return map2;
                    }
                }
            }
		}
        Map<String, Object> map2 = new HashMap<>();
        map2.put("data", "error");
        return map2;
    }

    /**
     * 添加用户信息
     * @param session
     * @param request
     * @param response
     * @throws Exception
     */
    @ArchivesLog(operationName = "用户补全信息",operationType = "更新信息")
    @RequestMapping(value = "/addData.action", method = RequestMethod.POST)
    public  void addData( HttpSession session,HttpServletRequest request,HttpServletResponse response) throws Exception {
    	response.setHeader("content-type", "text/html;charset=UTF-8"); 
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
        String telph = session.getAttribute("id").toString();
        String email =request.getParameter("email");
        if(RegexUtil.checkEmail(email)){
            String name =request.getParameter("name");
            if(RegexUtil.checkUserName(name)){
                String idnumber =request.getParameter("idnumber");
                if(RegexUtil.checkIdNumber(idnumber)){
                    String roleTemp = request.getParameter("role");
                    int role = Integer.valueOf(roleTemp.substring(roleTemp.lastIndexOf(":")+1)).intValue();
                    System.out.println(role);
                    UserInf userInf=(UserInf)session.getAttribute("user");
                    userInf.setIdnumber(idnumber);
                    userInf.setEmail(email);
                    userInf.setName(name);
                    int id = userInf.getId();
                    userService.adddata( email,name,idnumber,telph);
                    userService.addroleDist(id, role);
                }
            }
        }
//       	request.getRequestDispatcher("/html/main.html#/userData").forward(request, response);
        response.sendRedirect(request.getContextPath() + "/html/main.html#/userData");
    }
    
    /**
     * 获取用户自己信息
     * @param session
     * @return
     * @throws Exception
     */
    @ArchivesLog(operationName = "用户获取自己信息",operationType = "查询信息")
    @RequestMapping(value = "/getUserDate.action", method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> getUserDate( HttpSession session) throws Exception{
        UserInf user=(UserInf)session.getAttribute("user");
        Map<String, Object> userData = new HashMap<>();
        userData.put("id", user.getId());
        userData.put("nic", user.getUserid());
        userData.put("name", user.getName());
        userData.put("tel", user.getTel());
        userData.put("email", user.getEmail());
        userData.put("idnumber", user.getIdnumber());
        userData.put("regtime",user.getRegtime());
        UserInf userInf = new UserInf();
        userInf.setTel(user.getTel());
        if(user.getIdnumber() != null && user.getIdnumber().length() != 0) {
            Map<String, Object>  map = userService.selectroleAnddepart(userInf);
            if (map != null&&map.get("rolename") !=null&& map.get("departname")!=null) {
            	  userData.put("role", map.get("rolename"));
                  userData.put("depart", map.get("departname"));
    		}
        	userData.put("indexData", true);
        }
        else {
        	userData.put("indexData",false);
		}
        return  userData;
    }

    /**
     * 登录
     * @return
     * @throws Exception
     */
   /* @ArchivesLog(operationName = "用户登录",operationType = "查询信息")
    @RequestMapping("/login.action" )
    public String login(Model model, HttpSession session, String id, String pass, Integer type,HttpServletResponse response) throws Exception {
        UserInf user = userService.login(id,EncryptUtil.MD5ReEncrpt(pass));
        if(user!=null) {
            session.setAttribute("user", user);
            session.setAttribute("id", id);
            return "redirect:main.action";
//            return "redirect:/index.html";
        }else{
            Cookie cookie = new Cookie("msg",URLEncoder.encode("账号或密码错误!","UTF-8"));
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
            return "redirect:/index.html";
        }

    }*/
    @ResponseBody
    @ArchivesLog(operationName = "用户登录",operationType = "查询信息")
    @RequestMapping("/login.action" )
    public R login(@RequestBody Map<String,String > map,HttpSession session){
        System.out.println("进入登录...");
        String username=map.get("id");
        String password=map.get("pass");
        String code=map.get("code");

        String kaptcha=ShiroUtils.getKaptcha(Constants.KAPTCHA_SESSION_KEY);
        if(!kaptcha.equalsIgnoreCase(code)){
            return R.error("验证码不正确");
        }
        try {
            Subject subject=ShiroUtils.getSubject();
            UsernamePasswordToken token=new UsernamePasswordToken(username,EncryptUtil.MD5ReEncrpt(password));
            subject.login(token);
        } catch (UnknownAccountException e) {
            return R.error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return R.error(e.getMessage());
        }catch (LockedAccountException e) {
            return R.error(e.getMessage());
        }catch (AuthenticationException e) {
            return R.error("账户验证失败");
        }
        session.setAttribute("user",ShiroUtils.getUserEntity());
        session.setAttribute("id",ShiroUtils.getUserEntity().getId());
        Map<String,Object> msg=new HashMap<>();
        msg.put("code","0");
        msg.put("id",ShiroUtils.getUserEntity().getId());
        return R.ok(msg);
    }

    /**
     * 添加信息分发器
     * @param map
     * @return
     */
//    @RequiresPermissions(value = {"sys:user:add"})
    @ArchivesLog(operationName = "用户添加功能/角色/战区信息",operationType = "写入信息")
    @ResponseBody
    @RequestMapping("/distributor.action")
    public Map<String,Object> distributor(@RequestBody Map<String,Object> map){
//        System.out.println("进入添加分发器");
        Map<String,Object> states=(Map<String,Object>)map.get("states");
        Map<String ,Object> data=(Map<String,Object>)map.get("data");
        String id=String.valueOf(states.get("id"));
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        switch (id){
            //功能添加
            case "gongnengguanli":
                msg=userService.addFunction(data);
                break;
            //角色添加
            case "jueseguanli":
            	msg=userService.addRole(data);
            	break;
            //战区管理
            case "zhanquguanli":

                break;
            //没找到功能
            default:
                msg="error";
                break;
        }
        //返回信息
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 删除信息分发器
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "用户删除功能/角色/战区信息",operationType = "删除信息")
    @ResponseBody
    @RequestMapping("/deleteData.action")
    public Map<String,Object> deleteData(@RequestBody Map<String,Object> map){
//        System.out.println("进入删除分发器");
        Map<String,Object> states=(Map<String,Object>)map.get("states");
        Map<String,Object> data=(Map<String, Object>) map.get("data");
        String id=String.valueOf(states.get("id"));
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        switch (id){
            //功能删除
            case "gongnengguanli":
                msg=userService.deletegongneng(Integer.parseInt(String.valueOf(data.get("id"))));
                break;
            //角色删除
            case "jueseguanli":
                msg=userService.deleterole(Integer.parseInt(String.valueOf(data.get("id"))));
                break;
            //没找到功能
            case "yonghuguanli":
                msg=userService.deleteuser(Integer.parseInt(String.valueOf(data.get("id"))));
                break;
            //删除战区
            case "zhanquguanli":
                break;
            default:
                msg="error";
                break;
        }
        //返回信息
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 各个页面的分页显示
     * @param reMap
     * @return
     */
//    @RequiresPermissions(value = {"sys:user:select"})
    @ArchivesLog(operationName = "用户查询功能/角色/战区信息",operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selectPaging.action")
    public Paging selectPaging(@RequestBody Map<String,Object> reMap){
        System.out.println("进入分页查询分发器");
        Map<String,Object> page=(Map<String,Object>)reMap.get("page");
        Map<String,Object> state=(Map<String,Object>)reMap.get("state");
        Integer active=Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist=Integer.valueOf(String.valueOf(page.get("pagelist")));
        String id=String.valueOf(state.get("id"));
        Paging paging=new Paging();
        switch (id){
            //功能管理查询
            case "gongnengguanli":
                paging=userService.selectPaging("page_inf",(active-1)*pagelist,pagelist,null);
                break;
            //角色管理查询
            case "jueseguanli":
                paging = userService.selectPaging( "role_inf",(active-1)*pagelist,pagelist,null);
                break;
            //用户管理查询
            case "yonghuguanli":
                if(String.valueOf(state.get("ChildId")).equals("selectwill")){
                    paging=userService.selectPaging("user_department_role_view",(active-1)*pagelist,pagelist,"发起审核");
                }else if(String.valueOf(state.get("ChildId")).equals("selectok")){
                    paging=userService.selectPaging("user_department_role_view",(active-1)*pagelist,pagelist,"正常");
                }else {
                    paging=userService.selectPaging("user_department_role_view",(active-1)*pagelist,pagelist,"发起审核");
                }
                break;
            //战区管理查询
            case "zhanquguanli":
                paging=userService.selectPaging("department_inf",(active-1)*pagelist,pagelist,null);
                break;
            default:
                break;
        }
        return paging;
    }


    /**
     * 查询所有的角色
     * @return
     */
    @ArchivesLog(operationName = "用户查询所有角色信息",operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/allRole.action")
    public List<Map<String,Object>> allRole(){
        List<Map<String,Object>> list=userService.selectAllRole();
        return list;
    }

    /**
     * 查找单个数据是否存在
     * @param map 数据
     * @return 是否存在
     */
    @ArchivesLog(operationName = "用户检验信息完整",operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/inspectData.action")
    public Map<String,Object> inspectData(@RequestBody Map<String,Object> map){
        Map<String,Object> states=(Map<String,Object>)map.get("states");
        Map<String,Object> datas=(Map<String, Object>) map.get("data");
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        boolean mark=true;
        switch (String.valueOf(states.get("id"))){
            //检测功能
            case "gongnengguanli":
                //检测名字/url
                if(String.valueOf(datas.get("name")).equals("name")){
                    mark=userService.selectInspectData("page_inf","pagename",String.valueOf(datas.get("data")));
                }else if(String.valueOf(datas.get("name")).equals("url")){
                    mark=userService.selectInspectData("page_inf","url",String.valueOf(datas.get("data")));
                }
                break;
            //检测角色
            case "jueseguanli":
                //检测名字
                if(String.valueOf(datas.get("name")).equals("name")){
                    mark=userService.selectInspectData("role_inf","rolename",String.valueOf(datas.get("data")));
                }
                break;
            //检测战区
            case "zhanquguanli":
                //检测id/名字
                if(String.valueOf(datas.get("name")).equals("departid")){
                    mark=userService.selectInspectData("department_inf","departid",String.valueOf(datas.get("data")));
                }else if(String.valueOf(datas.get("name")).equals("name")){
                    mark=userService.selectInspectData("department_inf","departname",String.valueOf(datas.get("data")));
                }
                break;
            default:
                    break;
        }
        if(mark){
            msg="已存在";
        }
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 审核用户
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "审核用户",operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/examineUser.action")
    public Map<String,Object> examineUser(@RequestBody Map<String,Object> map){
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        if(String.valueOf(((Map<String,Object>)map.get("states")).get("id")).equals("yonghuguanli")){
            UserInf user=new UserInf();
            user.setId(Integer.parseInt(String.valueOf(map.get("data"))));
            user.setState("3");
            if(userService.updateUserState(user)!=0){
                msg="success";
            }else{
                msg="error";
            }
        }else{
            msg="error";
        }
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 冻结用户
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "冻结用户",operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/frozenUser.action")
    public Map<String,Object> frozenUser(@RequestBody Map<String,Object> map){
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        if(String.valueOf(((Map<String,Object>)map.get("states")).get("id")).equals("yonghuguanli")){
            UserInf user=new UserInf();
            user.setId(Integer.parseInt(String.valueOf(map.get("data"))));
            user.setState("4");
            if(userService.updateUserState(user)!=0){
                msg="success";
            }else{
                msg="error";
            }
        }else{
            msg="error";
        }
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 修改功能
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "修改功能页面信息",operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/updatePageInf.action")
    public Map<String,Object> updatePageInf(@RequestBody Map<String,Object> map){
        PageInf pageInf=new PageInf();
        Map<String,Object> returnData=new HashMap<>();
        String msg="";
        Map<String,Object> data=(Map<String,Object>)map.get("data");
        pageInf.setPagename(String.valueOf(data.get("pagename")));
        pageInf.setUrl(String.valueOf(data.get("url")));
        pageInf.setDetail(String.valueOf(data.get("detail")));
        pageInf.setId(Integer.parseInt(String.valueOf(data.get("id"))));
        if(userService.updatePageInf(pageInf)!=0){
            msg="success";
        }else{
            msg="error";
        }
        returnData.put("msg",msg);
        return returnData;
    }

    /**
     * 查询角色功能页面
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "查询所有功能页面信息",operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selecDistributionFunction.action")
    public Map<String,Object> getAllfunction(@RequestBody Map<String,Object> map,HttpSession session){
    	Map<String,Object> returnData = new HashMap<>();
    	returnData.put("allpage", userService.selectAllfunction());
    	List<PageDistribute> list=userService.selectHadfunction(Integer.parseInt(String.valueOf(map.get("data"))));
    	if(list.size()!=0){
        	List<Integer> list2 =new ArrayList<>();
        	for (PageDistribute pageDistribute:list) {
        		list2.add(pageDistribute.getPageid());
            }
        	returnData.put("id",list2);
        	returnData.put("data", "error");
    		return returnData;
    	}else{
    		
    		returnData.put("data", "success");
    		return returnData;
    	}
    	
    }

    /**
     * 增加角色功能
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "添加信息",operationName = "添加角色功能")
    @ResponseBody
    @RequestMapping("/updataDistributionFunction.action")
    public Map<String,Object> addfunction(@RequestBody Map<String,Object> map,HttpSession session){
    	Map<String,Object> returnData = new HashMap<>();
    	Integer jueseID =    (Integer) map.get("data");
    	Integer functionID =   (Integer) map.get("id");
    	PageDistribute pageDistribute =new PageDistribute();
        pageDistribute.setPageid(functionID);
        pageDistribute.setRoleid(jueseID);
        if(userService.updataDistributionFunction(pageDistribute)==0){
            returnData.put("data", "error");
        }else {
            returnData.put("data", "success");
        }
		return returnData;
    }
    
    /**
     * 删除角色功能
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "删除信息",operationName = "删除角色功能")
    @ResponseBody
    @RequestMapping("/delectDistributionFunction.action")
    public Map<String,Object> delectfunction(@RequestBody Map<String,Object> map,HttpSession session){
    	Map<String,Object> returnData = new HashMap<>();
    	int jueseID =    (int) map.get("data");
    	int functionID =   (int) map.get("id");
        if(userService.delectDistributionFunction(jueseID, functionID)==0){
            returnData.put("data", "error");
        }else {
            returnData.put("data", "success");
        }
		return returnData;
    }

    
}
