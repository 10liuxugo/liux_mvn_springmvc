package org.com.sys.liuxu.iservice;

import java.util.List;

import com.sys.liuxu.entity.UserInfoVo;



public interface IUserInfoService {
	public UserInfoVo login(UserInfoVo u);
	public List<UserInfoVo> GetUserList();
	public UserInfoVo selectByPrimaryKey(String id);
}
