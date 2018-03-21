package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;
import com.spring.service.UserService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 下午8:58:55 
* 类说明  对象注入属性的测试
*/
public class UserObjTest {
	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		UserService userService = (UserService) application.getBean("userService");
		System.out.println(userService.hashCode());
		userService.addUser();
	}
}
 