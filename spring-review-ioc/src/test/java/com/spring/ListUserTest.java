package com.spring;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月23日 下午4:50:34 
* 类说明  List方式注入测试
*/
public class ListUserTest {
	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		User user = (User) application.getBean("listUser");
		System.out.println(user.hashCode());
		List<String> arrs = user.getList();
		for (String string : arrs) {
			System.out.println(string);
		}
	}

}
 