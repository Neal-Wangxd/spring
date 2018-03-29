package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.bean.User;
import com.spring.util.UserRowMapper;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午2:42:37 
* 类说明  jdbcTemplate测试类
*/
public class JdbcTemplateDemo {
	
	static DriverManagerDataSource getDateSource(){
		//创建对象，设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybatis?useSSL=false");//
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;
	}
	
	
	@Test
	public void add(){
		//创建JdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		//调用JdbcTemplate对象提供的方法，实现操作
		String sql = "INSERT INTO USER (AGE, HIGHT, SALARY, USERNAME, BIRTHDAY) VALUES (?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, 30,175,18500.00,"大师",new Date());
		System.out.println(result);
	}
	
	@Test
	public void update(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		String sql = "UPDATE USER SET BIRTHDAY=? WHERE USERNAME=?";
		int result = jdbcTemplate.update(sql,new Date(88,1,10),"大师");
		System.out.println(result);
	}
	
	@Test
	public void delete(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		String sql = "DELETE FROM USER WHERE USERNAME=?";
		int result = jdbcTemplate.update(sql,"大师");
		System.out.println(result);
	}

	@Test
	public void count(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		String sql = "SELECT COUNT(*) FROM USER";
		int result = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(result);
	}
	
	@Test
	public void getUser(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		String sql = "SELECT * FROM USER WHERE AGE = ?";
		User user = jdbcTemplate.queryForObject(sql,new UserRowMapper(),30);
		System.out.println(user);
	}
	
	@Test
	public void getUserList(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDateSource());
		String sql = "SELECT * FROM USER WHERE AGE >= ? ORDER BY AGE DESC";
		List<User> userList = jdbcTemplate.query(sql,new UserRowMapper(),25);
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
	@Test
	public void jdbc(){
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet res = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis?useSSL=false","root","password");
			String sql = "SELECT * FROM USER";
			psmt = conn.prepareStatement(sql);
			res = psmt.executeQuery();
			while (res.next()) {
				User user = new User();
				user.setId(res.getInt("id"));
				user.setAge(res.getInt("age"));
				user.setUsername(res.getString("username"));
				user.setSalary(res.getDouble("salary"));
				user.setHight(res.getFloat("hight"));
				user.setBirthday(res.getDate("birthday"));
				System.out.println(user);
			}
		} catch (Exception e) {
			try {
				res.close();
				psmt.close();
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
 