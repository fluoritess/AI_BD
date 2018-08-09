package cn.itcast.ssm.controller;

import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.UserService;
import cn.itcast.ssm.spring.ArchivesLog;
import cn.itcast.ssm.util.PageUtils;
import cn.itcast.ssm.util.Paging;
import cn.itcast.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author tyh
 * @Package cn.itcast.ssm.controller
 * @Description:
 * @date 18-8-1 下午4:00
 */
@SuppressWarnings("ALL")
@Controller
public class ManagerController {
    @Autowired
    private UserService userService;

    /**
     * 添加功能信息
     *
     * @param map
     * @return
     */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    @ArchivesLog(operationName = "用户添加功能信息", operationType = "写入信息")
    @ResponseBody
    @RequestMapping("/addFunction.action")
    public Map<String, Object> addFunction(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        String msg = "";
        msg = userService.addFunction(data);
        //noinspection AlibabaUndefineMagicConstant
        if ("功能添加失败".equals(msg)) {
            return R.error(msg);
        }
        if ("功能添加成功".equals(msg)) {
            return R.ok(msg);
        } else {
            return R.error("功能添加失败");
        }

    }

    /**
     * 添加角色信息
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "用户添加角色信息", operationType = "写入信息")
    @ResponseBody
    @RequestMapping("/addRole.action")
    public Map<String, Object> addRole(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        String msg = "";
        msg = userService.addRole(data);
        if ("角色添加失败".equals(msg)) {

            return R.error(msg);
        }
        if ("角色添加成功".equals(msg)) {

            return R.ok(msg);
        } else {

            return R.error("角色添加失败");
        }

    }

    /**
     * 删除功能
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "删除功能", operationType = "删除信息")
    @ResponseBody
    @RequestMapping("/deleteFunctionData.action")
    public Map<String, Object> deleteFunctionData(@RequestBody Map<String, Object> map) {
        String msg = "";
        msg = userService.deletegongneng(Integer.parseInt(String.valueOf(map.get("id"))));
        if ("功能删除失败".equals(msg)) {

            return R.error(msg);
        }
        if ("功能删除成功".equals(msg)) {

            return R.ok(msg);
        } else {
            return R.error("删除出错");
        }

    }

    /**
     * 删除角色
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "删除角色", operationType = "删除信息")
    @ResponseBody
    @RequestMapping("/deleteRoleData.action")
    public Map<String, Object> deleteRoleData(@RequestBody Map<String, Object> map) {
        String msg = "";
        msg = userService.deleterole(Integer.parseInt(String.valueOf(map.get("id"))));
        if ("角色删除失败".equals(msg)) {

            return R.error(msg);
        }
        if ("角色删除成功".equals(msg)) {

            return R.ok(msg);
        } else {
            return R.error("删除出错");
        }

    }

    /**
     * 删除用户
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "删除用户", operationType = "删除信息")
    @ResponseBody
    @RequestMapping("/deleteUserData.action")
    public Map<String, Object> deleteUserData(@RequestBody Map<String, Object> map) {
        String msg = "";
        msg = userService.deleteuser(Integer.parseInt(String.valueOf(map.get("id"))));
        if ("用户删除失败".equals(msg)) {

            return R.error(msg);
        }
        if ("用户删除成功".equals(msg)) {

            return R.ok(msg);
        } else {
            return R.error("删除出错");
        }

    }


    /**
     * 查询功能分页
     *
     * @param reMap
     * @return
     */
    @ArchivesLog(operationName = "用户查询功能分页", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selectFunctionPaging.action")
    public Map<String, Object> selectFunctionPaging(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = userService.selectPaging("page_inf", (active - 1) * pagelist, pagelist, null);
        return R.ok("查询功能分页成功").put("data", paging);
    }

    /**
     * 查询角色分页
     *
     * @param reMap
     * @return
     */
    @ArchivesLog(operationName = "用户查询角色分页", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selectRolePaging.action")
    public Map<String, Object> selectRolePaging(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = userService.selectPaging("role_inf", (active - 1) * pagelist, pagelist, null);
        return R.ok("查询角色分页成功").put("data", paging);
    }

    /**
     * 查询用户分页
     *
     * @param reMap
     * @return
     */
    @ArchivesLog(operationName = "用户查询用户分页", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selectUserPaging.action")
    public Map<String, Object> selectUserPaging(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Map<String, Object> state = (Map<String, Object>) reMap.get("state");
        Paging paging = new Paging();
        if ("0".equals(String.valueOf(state.get("state")))) {
            paging = userService.selectPaging("user_manager", (active - 1) * pagelist, pagelist, "0");
        } else if ("1".equals(String.valueOf(state.get("state")))) {
            paging = userService.selectPaging("user_manager", (active - 1) * pagelist, pagelist, "1");
        } else {
            paging = userService.selectPaging("user_manager", (active - 1) * pagelist, pagelist, "0");
        }
        return R.ok("查询用户分页成功").put("data", paging);
    }


    /**
     * 查询所有的角色
     *
     * @return
     */
    @ArchivesLog(operationName = "用户查询所有角色信息", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/allRole.action")
    public Map<String, Object> allRole( HttpSession session) {
        UserInf user=(UserInf)session.getAttribute("user");
        List<Map<String, Object>> list = userService.selectAllRole();
        List<RoleDistribute> list2=userService.selectUserRole(user.getId());
        List list1 = new ArrayList();
        for (RoleDistribute roleDistribute:list2){

            list1.add( String.valueOf(roleDistribute.getRoleid()));
        }
        Map<String,Object> map = new HashMap<>(100);
        map.put("allRole",list);
        map.put("hadRole",list1);
        return R.ok("查询成功").put("data",map);
    }

    /**
     * 查找单个数据是否存在
     *
     * @param map 数据
     * @return 是否存在
     */
    @ArchivesLog(operationName = "用户检验信息完整", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/inspectData.action")
    public Map<String, Object> inspectData(@RequestBody Map<String, Object> map) {
        Map<String, Object> states = (Map<String, Object>) map.get("states");
        Map<String, Object> datas = (Map<String, Object>) map.get("data");

        String msg = "";
        boolean mark = true;
        switch (String.valueOf(states.get("id"))) {
            //检测功能
            case "gongnengguanli":
                //检测名字/url
                if ("name".equals(String.valueOf(datas.get("name")))) {
                    mark = userService.selectInspectData("page_inf", "pagename", String.valueOf(datas.get("data")));
                } else if ("url".equals(String.valueOf(datas.get("name")))) {
                    mark = userService.selectInspectData("page_inf", "url", String.valueOf(datas.get("data")));
                } else if ("perms".equals(String.valueOf(datas.get("name")))) {
                    mark = userService.selectInspectData("page_inf", "perms", String.valueOf(datas.get("data")));
                } else if ("order_num".equals(String.valueOf(datas.get("name")))) {
                    mark = userService.selectInspectData("page_inf", "order_num", String.valueOf(datas.get("data")));
                }
                break;
            //检测角色
            case "jueseguanli":
                //检测名字
                if ("name".equals(String.valueOf(datas.get("name")))) {
                    mark = userService.selectInspectData("role_inf", "rolename", String.valueOf(datas.get("data")));
                }
                break;
            //检测应用系统
            case "applicationguanli":
                if("name".equals(String.valueOf(datas.get("name")))){
                    mark = userService.selectInspectData("application_system_information","system_name",String.valueOf(datas.get("data")));
                }
            default:
                break;
        }
        if (mark) {
            return R.error("已存在");
        }

        return R.ok(msg);
    }

    /**
     * 审核用户
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "审核用户", operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/examineUser.action")
    public Map<String, Object> examineUser(@RequestBody Map<String, Object> map) {
        RoleDistribute roleDistribute = new RoleDistribute();
        roleDistribute.setRoleid(Integer.parseInt(String.valueOf(((Map<String, Object>) map.get("data")).get("roleid"))));
        roleDistribute.setUserid(Integer.parseInt(String.valueOf(((Map<String, Object>) map.get("data")).get("userid"))));
        roleDistribute.setState("1");
        if (userService.updateUserState(roleDistribute) != 0) {
            return R.ok("审核用户成功");
        } else {
            return R.error("审核用户错误");
        }
    }

    /**
     * 冻结用户
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "冻结用户", operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/frozenUser.action")
    public Map<String, Object> frozenUser(@RequestBody Map<String, Object> map) {
        RoleDistribute roleDistribute = new RoleDistribute();
        roleDistribute.setRoleid(Integer.parseInt(String.valueOf(((Map<String, Object>) map.get("data")).get("roleid"))));
        roleDistribute.setUserid(Integer.parseInt(String.valueOf(((Map<String, Object>) map.get("data")).get("userid"))));
        roleDistribute.setState("0");
        if (userService.updateUserState(roleDistribute) != 0) {
            return R.ok("退审用户成功");
        } else {
            return R.error("退审用户失败");
        }
    }

    /**
     * 修改功能
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "修改功能页面信息", operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/updatePageInf.action")
    public Map<String, Object> updatePageInf(@RequestBody Map<String, Object> map) {
        PageInf pageInf = new PageInf();
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        pageInf.setApplicationId(Integer.parseInt(String.valueOf(data.get("application"))));
        pageInf.setUrl(String.valueOf(data.get("url")));
        pageInf.setDetail(String.valueOf(data.get("detail")));
        pageInf.setPagename(String.valueOf(data.get("name")));
        pageInf.setIcon(String.valueOf(data.get("icon")));
        pageInf.setOrderNum(Integer.parseInt(String.valueOf(data.get("order_num"))));
        pageInf.setParentId(Integer.parseInt(String.valueOf(data.get("parentId"))));
        pageInf.setPerms(String.valueOf(data.get("perms")));
        pageInf.setType(Integer.parseInt(String.valueOf(data.get("type"))));
        pageInf.setId(Integer.parseInt(String.valueOf(data.get("id"))));
        if (pageInf.getOrderNum() < 200) {
            return R.error("系统初始配置无法修改！");
        }
        if (userService.updatePageInf(pageInf) != 0) {
            return R.ok("修改功能成功");
        } else {
            return R.error("修改功能失败");
        }

    }

    /**
     * 修改角色
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "修改角色信息", operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/updateRole.action")
    public Map<String, Object> updateRole(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        RoleInf roleInf = new RoleInf();
        roleInf.setId(Integer.parseInt(String.valueOf(data.get("id"))));
        roleInf.setRoledetail((String.valueOf(data.get("detail"))));
        roleInf.setRolename((String.valueOf(data.get("name"))));
        if (userService.updateRoleInf(roleInf) != 0) {
            return R.ok("修改角色成功");
        } else {
            return R.error("修改角色失败");
        }
    }

    /**
     * 查询角色功能页面
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "查询所有功能页面信息", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selecDistributionFunction.action")
    public Map<String, Object> getAllfunction(@RequestBody Map<String, Object> map) {
        Map<String, Object> returnData = new HashMap<>(4);
        List<String> list2 = new ArrayList<>();
        List<PageDistribute> list = userService.selectHadfunction(Integer.parseInt(String.valueOf(map.get("id"))));
        if (list.size() != 0) {

            for (PageDistribute pageDistribute : list) {
                list2.add(String.valueOf(pageDistribute.getPageid()));
            }
            returnData.put("hadFunction", list2);

        } else {
            returnData.put("hadFunction", list2);

        }

        returnData.put("allFunction", userService.selectAllfunction());
        return R.ok().put("data",returnData);


    }

    /**
     * 增加/删除角色功能
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "添加信息", operationName = "添加/删除角色功能")
    @ResponseBody
    @RequestMapping("/updataDistributionFunction.action")
    public Map<String, Object> addfunction(@RequestBody Map<String, Object> map) {
        Map<String, Object> returnData = new HashMap<>(6);
        Integer jueseID = (Integer) map.get("roleid");
        ArrayList addList = (ArrayList) map.get("addData");
        ArrayList deleteList = (ArrayList) map.get("deleteData");
        List<PageDistribute> addlist = new ArrayList<>();
        List<PageDistribute> deletelist = new ArrayList<>();
        for (int i = 0; i < addList.size(); i++) {
            PageDistribute pageDistribute = new PageDistribute();
            pageDistribute.setRoleid(jueseID);
            pageDistribute.setPageid(Integer.parseInt(String.valueOf(addList.get(i))));
            addlist.add(pageDistribute);
        }
        for (int j = 0; j < deleteList.size(); j++) {
            PageDistribute pageDistribute = new PageDistribute();
            pageDistribute.setRoleid(jueseID);
            pageDistribute.setPageid(Integer.parseInt(String.valueOf(deleteList.get(j))));
            deletelist.add(pageDistribute);
        }
        Boolean msg = userService.updataFunction(addlist, deletelist);

        if (msg == true) {

            return R.ok("数据更新成功");
        }
        if (msg == false) {
            return R.error("数据更新不成功（没有数据更新）");
        }


        return R.error( "数据更新失败");
    }

    /**
     * 删除角色功能
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "删除信息", operationName = "删除角色功能")
    @ResponseBody
    @RequestMapping("/delectDistributionFunction.action")
    public Map<String, Object> delectfunction(@RequestBody Map<String, Object> map, HttpSession session) {
        Map<String, Object> returnData = new HashMap<>(4);
        int jueseID = (int) map.get("data");
        int functionID = (int) map.get("id");
        if (userService.delectDistributionFunction(jueseID, functionID) == 0) {
            return R.error("删除角色失败");
        } else {
            return R.ok("删除角色成功");
        }

    }

    /**
     * 查询用户当前可见页面
     *
     * @param session
     * @return
     */
    @ArchivesLog(operationType = "查询信息", operationName = "查询当前用户可见页面")
    @ResponseBody
    @RequestMapping("/selectUserPage.action")
    public R selectUserPage(HttpSession session) {
        UserInf userInf = (UserInf) session.getAttribute("user");
        List<PageUtils> pageList = new ArrayList<>();
        pageList = userService.getUserAllPage(userInf.getId());
        Set<String> perms = new LinkedHashSet<>();
        perms = userService.getUserPermissions(userInf);
        Map<String,Object> map = new HashMap<>(4);
        map.put("userPageList",pageList);
        map.put("perms",perms);
        return R.ok().put("data", map);
    }
    /**
     * 查询已有应用系统
     */
    @ArchivesLog(operationType = "查询信息", operationName = "查询应用系统")
    @ResponseBody
    @RequestMapping("/selectApplicationId.action")
    public Map<String, Object> selectApplicationId() {
        List<Map<String, Object>> list = userService.selectApplicationId();
        if (list.size() != 0) {
            return R.ok().put("data", list);
        } else {
            return R.error("查询应用错误");
        }
    }

    /**
     * 查询菜单
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "查询信息", operationName = "查询应用系统")
    @ResponseBody
    @RequestMapping("/selectMenu.action")
    public Map<String, Object> selectMenu(@RequestBody Map<String, Object> map) {
        List<Map<String, Object>> list = userService.selectMenu();
        if (list.size() != 0) {
            return R.ok().put("data", list);

        } else {
            return R.error("查询菜单错误");
        }
    }

    /**
     * 查询应用系统管理分页
     *
     * @param reMap
     * @return
     */
    @ArchivesLog(operationName = "应用系统管理分页", operationType = "查询信息")
    @ResponseBody
    @RequestMapping("/selectManageSystemPaging.action")
    public Map<String, Object> selectManageSystemPaging(@RequestBody Map<String, Object> reMap) {
        Map<String, Object> page = (Map<String, Object>) reMap.get("page");
        Integer active = Integer.valueOf(String.valueOf(page.get("active")));
        Integer pagelist = Integer.valueOf(String.valueOf(page.get("pagelist")));
        Paging paging = new Paging();
        paging = userService.selectPaging("application_system_information", (active - 1) * pagelist, pagelist, null);
        return R.ok("查询应用系统管理分页成功").put("data", paging);
    }

    /**
     * 修改应用管理系统
     * @param map
     * @return
     */
    @ArchivesLog(operationName = "修改应用管理系统", operationType = "更新信息")
    @ResponseBody
    @RequestMapping("/updataSystemManage.action")
    public Map<String, Object> updataSystemManage(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        Integer id = Integer.parseInt(String.valueOf(data.get("id")));
        ApplicationSystemInformation information = new ApplicationSystemInformation();
        information.setDetail(String.valueOf(data.get("detail")));
        information.setRemarks(String.valueOf(data.get("remark")));
        information.setSystemName(String.valueOf(data.get("name")));
        information.setApplicationSystemId(id);
        if (userService.updateSystemManange(information) != 0) {
            return R.ok("修改应用管理成功");
        } else {
            return R.error("修改应用管理失败");
        }
    }

    /**
     * 增加应用系统管理
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "增加应用系统管理", operationName = "增加系统")
    @ResponseBody
    @RequestMapping("/addSystemManage.action")
    public Map<String, Object> addSystemManage(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        ApplicationSystemInformation information = new ApplicationSystemInformation();
        information.setRemarks(String.valueOf(data.get("remark")));
        information.setDetail(String.valueOf(data.get("detail")));
        information.setSystemName(String.valueOf(data.get("name")));
        if (userService.addSystemManage(information) == 0) {
            return R.error("增加应用系统管理失败");
        } else {
            return R.ok("增加应用系统管理成功");
        }

    }

    /**
     * 删除应用系统管理
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "删除应用系统管理", operationName = "删除系统")
    @ResponseBody
    @RequestMapping("/deleteSystemManage.action")
    public Map<String, Object> deleteSystemManage(@RequestBody Map<String, Object> map) {
        Map<String, Object> data = (Map<String, Object>) map.get("data");
        Integer id = Integer.parseInt(String.valueOf(data.get("id")));
        if (userService.deleteSystemManage(id) == 0) {
            return R.error("删除应用系统管理失败");
        } else {
            return R.ok("删除应用系统管理成功");
        }

    }

    /**
     * 用户选择角色
     *
     * @param map
     * @return
     */
    @ArchivesLog(operationType = "添加信息", operationName = "添加/删除角色")
    @ResponseBody
    @RequestMapping("/updateUserRole.action")
    public Map<String, Object> updataUserRole(@RequestBody Map<String, Object> map,HttpSession session) {
        Map<String, Object> returnData = new HashMap<>(6);
        UserInf userInf=(UserInf)session.getAttribute("user");
        Integer userID = userInf.getId();
        ArrayList addList = (ArrayList) map.get("addData");
        ArrayList deleteList = (ArrayList) map.get("deleteData");
        List<RoleDistribute> addlist = new ArrayList<>();
        List<RoleDistribute> deletelist = new ArrayList<>();
        for (int i = 0; i < addList.size(); i++) {
                RoleDistribute roleDistribute = new RoleDistribute();
            roleDistribute.setUserid(userID);
            roleDistribute.setRoleid(Integer.parseInt(String.valueOf(addList.get(i))));
            addlist.add(roleDistribute);
        }
        for (int j = 0; j < deleteList.size(); j++) {
            RoleDistribute roleDistribute = new RoleDistribute();
            roleDistribute.setUserid(userID);
            roleDistribute.setRoleid(Integer.parseInt(String.valueOf(deleteList.get(j))));
            deletelist.add(roleDistribute);
        }
        Boolean msg = userService.updataRole(addlist, deletelist);

        if (msg == true) {

            return R.ok("数据更新成功");
        }
        if (msg == false) {
            return R.error("数据更新不成功（没有数据更新）");
        }


        return R.error( "数据更新失败");
    }

}

