package com.spring;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月23日 下午4:54:23 
* 类说明 Map方式注入属性值
*/
public class MapUserTest {
	@Test
	public void testUser(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		User user = (User) application.getBean("mapUser");
		System.out.println(user.hashCode());
		Map<String,String> maps = user.getMap();
		System.out.println(maps);
	}
}
 