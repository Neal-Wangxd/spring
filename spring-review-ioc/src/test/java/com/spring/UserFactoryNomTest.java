package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 下午2:17:53 
* 类说明  实例工厂创建对象
*/
public class UserFactoryNomTest {

	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		User user = (User) application.getBean("userNom");
		System.out.println(user);
	}
}
 