package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.AnnoUserService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 下午1:52:23 
* 类说明  使用注解注入对象测试
*/
public class ServiceUserTest {
	
	@Test
	public void serviceUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		AnnoUserService userService = (AnnoUserService) application.getBean("userService");
		System.out.println(userService);
		userService.addUser();
	}
}
 