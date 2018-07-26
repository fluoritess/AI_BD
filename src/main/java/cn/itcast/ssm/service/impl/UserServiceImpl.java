package cn.itcast.ssm.service.impl;

import cn.itcast.ssm.mapper.*;
import cn.itcast.ssm.po.*;
import cn.itcast.ssm.service.UserService;
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
        page.setUrl(String.valueOf(data.get("url")));
        page.setDetail(String.valueOf(data.get("detail")));
        page.setPagename(String.valueOf(data.get("name")));
        if(pageInfMapper.insertSelective(page)!=0){
            return "success";
        }else{
            return "error";
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
        page.setLists(utilMapper.selectPaging(name,offset,pageSize,roleState));
        return page;
    }

    @Override
	public String addRole(Map<String, Object> data) {
		// TODO 自动生成的方法存根
		RoleInf roleInf = new RoleInf();
		roleInf.setRolename(String.valueOf(data.get("name")));
		roleInf.setRoledetail(String.valueOf(data.get("detail")));
		  if(roleInfMapper.insertSelective(roleInf)!=0){
	            return "success";
	        }else{
	            return "error";
	        }
	}

	@Override
	public String deleterole(Integer id) {
		// TODO 自动生成的方法存根
		if(roleInfMapper.deleteByPrimaryKey(id)!=0){
			return "success";
		}else {
			return "error";
		}
	}

	@Override
	public String deletegongneng(Integer id) {
		// TODO 自动生成的方法存根
	if(pageInfMapper.deleteByPrimaryKey(id)!=0){
			return "success";
		}else {
			return "error";
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
    public int updateUserState(UserInf userInf) {
        UserInfExample userInfExample = new UserInfExample();
        UserInfExample.Criteria criteria = userInfExample.createCriteria();
        criteria.andIdEqualTo(userInf.getId());
        return userInfMapper.updateByExampleSelective(userInf,userInfExample);
    }

    @Override
    public int updatePageInf(PageInf pageInf) {
        return pageInfMapper.updateByPrimaryKey(pageInf);
    }
	@Override
	public List<PageInf> selectAllfunction() {
		// TODO 自动生成的方法存根
		List<PageInf> pageInfs=pageInfMapper.selectByExample(null);
		
		return pageInfs;
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
        Set<String> permsSet = new HashSet<String>();
        if(user.getState().equals("1")){
            List<String> permsList=utilMapper.selectUserPermission(user.getId());
            for(String perms : permsList){
                if(StringUtils.isBlank(perms)){
                    continue;
                }
                permsSet.addAll(Arrays.asList(perms.trim().split(",")));
            }
        }
        return permsSet;
    }


}
