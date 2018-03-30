package com.spring;



import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;
import com.spring.service.UserService;


/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午2:42:37 
* 类说明  jdbcTemplate测试类
*/
public class C3p0Test {
	
	ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
	UserService userService = (UserService) application.getBean("userService");
	
	@Test
	public void add(){
		User user = new User();
		user.setAge(50);
		user.setUsername("孙行者");
		user.setHight(165.3f);
		user.setSalary(8000.00);
		user.setBirthday(new Date());
		userService.add(user);
	}
	
	@Test
	public void update(){
		User user = new User();
		user.setId(61);
		user.setAge(30);
		user.setUsername("孙行者");
		user.setHight(165.3f);
		user.setSalary(8000.00);
		user.setBirthday(new Date(88,1,10));
		userService.update(user);
	}
	
	@Test
	public void delete(){
		userService.delete(61);
	}
	
	@Test
	public void count(){
		int count = userService.count();
		System.out.println(count);
	}
	
	@Test
	public void getUserByName(){
		User user = userService.getUserByName("大师");
		System.out.println(user);
	}
	
	@Test
	public void getUserList(){
		List<User> userList = userService.getUserList();
		for (User user : userList) {
			System.out.println(user);
		}
	}
	
}
 