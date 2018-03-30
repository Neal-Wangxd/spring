package com.spring.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.bean.User;
import com.spring.util.UserRowMapper;


/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月30日 上午11:14:34 
* 类说明 
*/
@SuppressWarnings("restriction")
@Component(value="userDao")
public class UserDao {
	
	
	//得到JdbcTemplate模板对象
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	//添加User
	public void add(User user){
		String sql = "INSERT INTO USER (AGE, HIGHT, SALARY, USERNAME, BIRTHDAY) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getAge(),user.getHight(),user.getSalary(),user.getUsername(),user.getBirthday());
	}
	
	public void update(User user){
		String sql = "UPDATE USER SET AGE=?,HIGHT=?,SALARY=?,USERNAME=?,BIRTHDAY=? WHERE ID=?";
		jdbcTemplate.update(sql,user.getAge(),user.getHight(),user.getSalary(),user.getUsername(),user.getBirthday(),user.getId());
	}
	
	public void delete(int id){
		String sql = "DELETE FROM USER WHERE ID=?";
		jdbcTemplate.update(sql,id);
	}
	
	public int count(){
		String sql = "SELECT COUNT(*) FROM USER";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}
	
	public User getUserByName(String name){
		User user = null;
		try {
			String sql = "SELECT * FROM USER WHERE USERNAME = ?";
			user = jdbcTemplate.queryForObject(sql,new UserRowMapper(),name);
		} catch (Exception e) {
			return null;
		}
		return user;
	}
	
	public List<User> getUserList(){
		List<User> userList = null;
		try {
			String sql = "SELECT * FROM USER ORDER BY AGE DESC";
			userList = jdbcTemplate.query(sql,new UserRowMapper());
		} catch (Exception e) {
			return null;
		}
		return userList;
	}

}
 