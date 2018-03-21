package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 上午10:32:11 
* 类说明  用户测试类
*/
public class UserTest {
	
	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		User user = (User) application.getBean("user");
		User user1 = (User) application.getBean("user");
		System.out.println(user.hashCode());
		System.out.println(user1.hashCode());
		user.testUser();
		user1.testUser();
	}
	

}
 