package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.UserService;
import cn.itcast.ssm.util.PageUtils;
import cn.itcast.ssm.util.Paging;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


/**
 * @author tyh
 * @Package cn.itcast.ssm.service.impl
 * @Description:
 * @date 2018/5/9 15:14
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfMapper userInfMapper;
    @Autowired
    private PageInfMapper pageInfMapper;
    @Autowired
    private UserUtilMapper utilMapper;
    @Autowired
    private RoleInfMapper roleInfMapper;
    @Autowired
    private RoleDistributeMapper roleDistributeMapper;
    @Autowired
    private PageDistributeMapper  pageDistributeMapper;
    @Autowired
    private  ApplicationSystemInformationMapper applicationSystemInformationMapper;
    @Override
    public boolean register(UserInf user) {
        if(userInfMapper.insertSelective(user)!=0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public UserInf findId(String tel){
        // TODO 自动生成的方法存根
        List<UserInf> users =new ArrayList<UserInf>();
        //定义查询对象
        UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();

        criteria.andTelEqualTo(tel);
        users = userInfMapper.selectByExample(userInfExample);
        if(users.size()==1) {
            return users.get(0);
        }
        return null;


    }

    @Override
    public void updatepw(String password,String tel) {
        // TODO 自动生成的方法存根

        UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();
        UserInf userInf = new UserInf();
        userInf.setPassword(password);
        criteria.andTelEqualTo(tel);
        userInfMapper.updateByExampleSelective(userInf, userInfExample);
    }

    @Override
    public UserInf login(String tel,String password) throws Exception {
        List<UserInf> users =new ArrayList<UserInf>();
        //定义查询对象
        UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();
        criteria.andTelEqualTo(tel);
        criteria.andPasswordEqualTo(password);
        users = userInfMapper.selectByExample(userInfExample);
        if(users.size()==1) {
            return users.get(0);
        }
        return null;
        
    }


    @Override
    public void uadatedate(String name, String userid,String email,String tel) {
        // TODO 自动生成的方法存根
        UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();
        UserInf userInf = new UserInf();
        userInf.setName(name);
        userInf.setEmail(email);
        userInf.setUserid(userid);
        criteria.andTelEqualTo(tel);
        userInfMapper.updateByExampleSelective(userInf, userInfExample);
    }

    /**
     * 第一次登陆修改信息
     * @param email
     * @param name
     * @param idnumber
     * @param telph
     */
	@Override
	public void adddata(String email, String name, String idnumber, String telph) {
		// TODO 自动生成的方法存根
		UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();
        UserInf userInf = new UserInf();
        userInf.setEmail(email);
        userInf.setName(name);
        userInf.setIdnumber(idnumber);
        criteria.andTelEqualTo(telph);
        userInfMapper.updateByExampleSelective(userInf, userInfExample);
		
	}

    @Override
    public String addFunction(Map<String, Object> data) {
        PageInf page=new PageInf();
        page.setApplicationId(Integer.parseInt(String.valueOf(data.get("application"))));
        page.setUrl(String.valueOf(data.get("url")));
        page.setDetail(String.valueOf(data.get("detail")));
        page.setPagename(String.valueOf(data.get("name")));
        page.setIcon(String.valueOf(data.get("icon")));
        page.setOrderNum(Integer.parseInt(String.valueOf(data.get("order_num"))));
        page.setParentId(Integer.parseInt(String.valueOf(data.get("parentId"))));
        page.setPerms(String.valueOf(data.get("perms")));
        page.setType(Integer.parseInt(String.valueOf(data.get("type"))));
        if(pageInfMapper.insertSelective(page)!=0){
            return "功能添加成功";
        }else{
            return "功能添加失败";
        }
    }

    @Override
    public Paging selectPaging(String name, int offset, int pageSize,String roleState) {
        Paging page=new Paging();
        //查询出注释
        page.addDataTitle(utilMapper.selectNotes(name));
        //查询出总条数
        page.setListTotal(utilMapper.selectCount(name,roleState));
        //查询数据
        List<Map<String,Object>> list= utilMapper.selectPaging(name,offset,pageSize,roleState);

        for (Map<String,Object> map:list ){
            if(map.get("regtime")!=null){
                map.put("regtime",((Date)(map.get("regtime"))).getTime());
            }
            //补充一级目录为空的字段
            if(name.equals("page_inf")&&map.get("parentName")==null){
                int location=list.indexOf(map);
                int mark=0;
                LinkedHashMap<String,Object> newMap=new LinkedHashMap<>();
                for(Map.Entry<String,Object> entry:map.entrySet()){
                    if(mark==3){
                        newMap.put("parentName","/");
                    }
                    newMap.put(entry.getKey(),entry.getValue());
                    mark++;
                }
                list.set(location,newMap);
            }
        }
        page.setLists(list);
        return page;
    }

    @Override
	public String addRole(Map<String, Object> data) {
		// TODO 自动生成的方法存根
		RoleInf roleInf = new RoleInf();
		roleInf.setRolename(String.valueOf(data.get("name")));
		roleInf.setRoledetail(String.valueOf(data.get("detail")));

		  if(roleInfMapper.insertSelective(roleInf)!=0){
	            return "角色添加成功";
	        }else{
	            return "角色添加失败";
	        }
	}

	@Override
	public String deleterole(Integer id) {
		// TODO 自动生成的方法存根
		if(roleInfMapper.deleteByPrimaryKey(id)!=0){
			return "角色删除成功";
		}else {
			return "角色删除失败";
		}
	}

	@Override
	public String deletegongneng(Integer id) {
		// TODO 自动生成的方法存根
	if(pageInfMapper.deleteByPrimaryKey(id)!=0){
			return "功能删除成功";
		}else {
			return "功能删除失败";
		}
	}

	@Override
	public String deleteuser(Integer id) {
		// TODO 自动生成的方法存根
    if(userInfMapper.deleteByPrimaryKey(id)!=0){
			return "success";
		}else {
			return "error";
		}
	}


    @Override
    public List<Map<String, Object>> selectAllRole() {
        List<Map<String, Object>> list=new ArrayList<>();
        List<RoleInf> roleInfs=roleInfMapper.selectByExample(null);
        for (RoleInf role:roleInfs) {
            Map<String,Object> map=new HashMap<>();
            map.put("id",role.getId());
            map.put("name",role.getRolename());
            list.add(map);
        }
        return list;
    }


	@Override
	public void addroleDist(int userid, int roleid) {
		// TODO 自动生成的方法存根
		
		RoleDistribute roleDistribute = new RoleDistribute();
		roleDistribute.setRoleid(roleid);
		roleDistribute.setUserid(userid);
		roleDistributeMapper.insertSelective(roleDistribute);
	}

	@Override
	public Map<String, Object> selectroleAnddepart(UserInf userInf) {
		// TODO 自动生成的方法存根
		 List<Map<String,Object>> list = utilMapper.selectUDRView(userInf);
		return list.get(0);
	}

    @Override
    public boolean selectInspectData(String tableName,String listName,String listValue) {
        List<Map<String,Object>> list=utilMapper.selectInspectData(tableName,listName,listValue);
        return list.size()!=0;
    }


    @Override
    public int updateUserState(RoleDistribute roleDistribute) {
        RoleDistributeExample roleDistributeExample=new RoleDistributeExample();
        RoleDistributeExample.Criteria criteria=roleDistributeExample.createCriteria();
        criteria.andRoleidEqualTo(roleDistribute.getRoleid());
        criteria.andUseridEqualTo(roleDistribute.getUserid());
        return roleDistributeMapper.updateByExampleSelective(roleDistribute,roleDistributeExample);
    }
    @Override
    public int updateRoleInf(RoleInf roleInf) {
        return roleInfMapper.updateByPrimaryKey(roleInf);
    }
    @Override
    public int updatePageInf(PageInf pageInf) {
        return pageInfMapper.updateByPrimaryKey(pageInf);
    }
	@Override
	public List<Map<String, Object>> selectAllfunction() {
		// TODO 自动生成的方法存根
        List<Map<String, Object>> lists = new ArrayList<>() ;
		List<PageInf> pageInfs=pageInfMapper.selectByExample(null);
		for (PageInf pageInf:pageInfs){
            Map<String,Object> map=new HashMap<>();
            map.put("detail",pageInf.getDetail());
            map.put("type",pageInf.getType());
            map.put("pagename",pageInf.getPagename());
            map.put("id",pageInf.getId());
		  lists.add(map);

        }
		return lists;
	}


	@Override
	public List<PageDistribute> selectHadfunction(Integer roleid) {
		// TODO 自动生成的方法存根
		PageDistributeExample pageDistributeExample = new PageDistributeExample();
		PageDistributeExample.Criteria criteria = pageDistributeExample.createCriteria();
		
		criteria.andRoleidEqualTo(roleid);
		List<PageDistribute> pageDistributes =pageDistributeMapper.selectByExample(pageDistributeExample);
		return pageDistributes ;
	}

	@Override
	public int updataDistributionFunction(PageDistribute pageDistribute) {
		// TODO 自动生成的方法存根
		
		return pageDistributeMapper.insert(pageDistribute);
		
	}

	@Override
	public int delectDistributionFunction(int jueseID, int functionID) {
		// TODO 自动生成的方法存根
		
		PageDistributeExample pageDistributeExample = new PageDistributeExample();
		PageDistributeExample.Criteria criteria = pageDistributeExample.createCriteria();
		
		criteria.andRoleidEqualTo(jueseID);
		criteria.andPageidEqualTo(functionID);
		return pageDistributeMapper.deleteByExample(pageDistributeExample);
		
		 
	}

    @Override
    public Set<String> getUserPermissions(UserInf user) {
        List<String> permsList = new ArrayList<>();
        Set<String> permsSet = new HashSet<String>();
        if(user.getState().equals("1")){
            if(user.getId()==1){
                PageInfExample pageInfExample=new PageInfExample();
                List<PageInf> pageInfList = pageInfMapper.selectByExample(pageInfExample);
                for (PageInf pageInf:pageInfList){
                    permsList.add(pageInf.getPerms());
                }
            }else{
                permsList=utilMapper.selectUserPermission(user.getId());
            }
            for(String perms : permsList){
                if(StringUtils.isBlank(perms)){
                    continue;
                }
                permsSet.addAll(Arrays.asList(perms.trim().split(",")));
            }
        }
        return permsSet;
    }


    @Override
    public List<PageUtils> getUserAllPage(int userId) {
        //系统管理员，拥有最高权限
        if(userId == 1){
           return getAllPage(null);
        }

        //查询用户的菜单
        List<Integer> pageIdList=utilMapper.selectAllPageId(userId);
        return getAllPage(pageIdList);
    }

    private List<PageUtils> getListParentId(int parentId,List<Integer> pageIdList){
        PageInfExample pageInfExample=new PageInfExample();
        PageInfExample.Criteria criteria=pageInfExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        pageInfExample.setOrderByClause("order_num asc");
        List<PageUtils> pageUtilsList=new ArrayList<>();
        //根据副菜单id获取子菜单列表
        List<PageInf> pageInfs=pageInfMapper.selectByExample(pageInfExample);
        //将页面信息装进工具类
        for(PageInf pageInf:pageInfs){
            PageUtils pageUtils=new PageUtils();
            pageUtils.setPageInf(pageInf);
            pageUtilsList.add(pageUtils);
        }
        //超级用户权限
        if(pageIdList==null){
            return pageUtilsList;
        }
        //过滤出当前用户有权查看的子菜单列表
        List<PageUtils> userPageList=new ArrayList<>();
        for(PageUtils pageUtils:pageUtilsList){
            if(pageIdList.contains(pageUtils.getPageInf().getId())){
                userPageList.add(pageUtils);
            }
        }
        return userPageList;
    }

    private void getPageTreeList(List<PageUtils> pageList,List<Integer> pageIdList){
        for(PageUtils pageUtils:pageList){
            if(pageUtils.getPageInf().getType()==0){//目录,只能遍历到二级目录
                //根据菜单id获取当前用户可见的子菜单列表
                List<PageUtils> subPageList=getListParentId(pageUtils.getPageInf().getId(),pageIdList);
                //对子菜单又进行递归查询其子菜单
                getPageTreeList(subPageList,pageIdList);
                //将子菜单装入父菜单
                pageUtils.setList(subPageList);
            }
        }
    }

    private List<PageUtils> getAllPage(List<Integer> pageIdList){
        //查询跟菜单
        List<PageUtils> pageUtilsList=getListParentId(0,pageIdList);
        //查询子菜单
        getPageTreeList(pageUtilsList,pageIdList);
        return pageUtilsList;
    }

    public List<Map<String,Object>> selectApplicationId(){

        List<Map<String, Object>> list=new ArrayList<>();
        List<ApplicationSystemInformation> applicationSystemInformations=applicationSystemInformationMapper.selectByExample(new ApplicationSystemInformationExample());

        for(ApplicationSystemInformation applicationSystemInformation:applicationSystemInformations)
        {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("application_system_id",applicationSystemInformation.getApplicationSystemId());
            map.put("system_name",applicationSystemInformation.getSystemName());
            list.add(map);
        }

        return  list;
    }

    public List<Map<String,Object>> selectMenu(){

        List<Map<String, Object>> list=new ArrayList<>();
        PageInfExample pageInfExample=new PageInfExample();
        PageInfExample.Criteria criteria=pageInfExample.createCriteria();
        criteria.andTypeBetween(0,1);
        List<PageInf>  pageInfs=pageInfMapper.selectByExample(pageInfExample);
        for(PageInf pageInf:pageInfs){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",pageInf.getId());
            map.put("pagename",pageInf.getPagename());
            map.put("oder_num",pageInf.getOrderNum());
            map.put("parentId",pageInf.getParentId());
            list.add(map);
        }
        return  list;
    }

}
