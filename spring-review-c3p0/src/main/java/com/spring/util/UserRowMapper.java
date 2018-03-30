package com.spring.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午5:24:27 
* 类说明  JdcbTemplate查询对象时所需的工具类
*/
public class UserRowMapper implements RowMapper<User>{
	public User mapRow(ResultSet res, int rowNum) throws SQLException {
		User user = new User();
		user.setId(res.getInt("id"));
		user.setAge(res.getInt("age"));
		user.setUsername(res.getString("username"));
		user.setSalary(res.getDouble("salary"));
		user.setHight(res.getFloat("hight"));
		user.setBirthday(res.getDate("birthday"));
		return user;
	}

}
 