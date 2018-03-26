package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.AnnoUser;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 上午11:32:50 
* 类说明  注解方式注入测试
*/
public class AnnoUserTest {
	
	@Test
	public void getUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		AnnoUser user = (AnnoUser) application.getBean("annoUser");
		AnnoUser user1 = (AnnoUser) application.getBean("annoUser");
		System.out.println(user.hashCode());
		System.out.println(user1.hashCode());
		
	}
}
 