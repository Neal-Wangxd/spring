package com.spring;

import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月23日 下午4:59:23 
* 类说明 Properties注入属性值测试
*/
public class PropertiesUserTest {
	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		User user = (User) application.getBean("proUser");
		System.out.println(user.hashCode());
		Properties pro = user.getProperties();
		System.out.println(pro);
	}
}
 