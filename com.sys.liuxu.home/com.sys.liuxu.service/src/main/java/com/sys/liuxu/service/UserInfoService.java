package com.sys.liuxu.service;



import java.util.ArrayList;
import java.util.List;

import org.com.sys.liuxu.iservice.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sys.liuxu.dao.UsersInfoDao;
import com.sys.liuxu.entity.UserInfoVo;





@Service("userInfoService")
public class UserInfoService  implements IUserInfoService {

	@Autowired
	private UsersInfoDao usersInfoDao;
	public UserInfoVo login(UserInfoVo u) {
		// TODO Auto-generated method stub
		u = new UserInfoVo();
		u.setName("name");
		u.setPassword("pwd");
		u = usersInfoDao.login(u);
		return u;
	}

	public List<UserInfoVo> GetUserList() {
		// TODO Auto-generated method stub
		List<UserInfoVo> list = new ArrayList<UserInfoVo>();
		list = usersInfoDao.GetUserList();
		return list;
	}

	public UserInfoVo selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		UserInfoVo info = usersInfoDao.selectByPrimaryKey(id);
		return info;
	}

}
