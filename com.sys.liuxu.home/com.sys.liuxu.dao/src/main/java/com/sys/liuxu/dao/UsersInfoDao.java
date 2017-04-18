package com.sys.liuxu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.com.sys.liuxu.dao.base.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sys.liuxu.entity.UserInfoVo;




@Repository("usersInfoDao")
public class UsersInfoDao {

	@Autowired
	private BaseDao baseDao;

	@Autowired
	@Qualifier("film-template") 

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public UserInfoVo login(UserInfoVo u) {
		// TODO Auto-generated method stub	
		String sql = "select * from user where name=? and password=?";
		Object[] param = new Object[] { u.getName(), u.getPassword() };
		List<UserInfoVo> la = jdbcTemplate.query(sql, param, new RowMapper<UserInfoVo>() {
			public UserInfoVo mapRow(ResultSet rs, int i) throws SQLException {
				UserInfoVo vo = new UserInfoVo();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				return vo;
			}
		});
		if (la != null && la.size() > 0) {
			return la.get(0);
		} else {
			return null;
		}
	}

	public List<UserInfoVo> GetUserList() {
		List<UserInfoVo> userMap = new ArrayList<UserInfoVo>();
		String sql = "select * from user";
		// return jdbcTemplate.query(sql, new RowMapperResultReader(new
		// UserRowMapper()));
		// List<UserVo> list = jdbcTemplate.query(sql, new rowMapper<UserVo>());

		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper(UserInfoVo.class));
	}

	public UserInfoVo selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		
		return   baseDao.findOne("com.sys.liuxu.dao.UserMapper.selectByPrimaryKey", id);

		
	}

	

}
