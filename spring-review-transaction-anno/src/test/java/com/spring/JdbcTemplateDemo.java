package com.spring;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.UserService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年4月2日 下午2:42:37 
* 类说明  jdbcTemplate测试类
*/
public class JdbcTemplateDemo {
	
	@Test
	public void account(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		//得到配置文件中对象的ID
		UserService userService = (UserService) application.getBean("userService");
		System.out.println(userService);
		userService.account(1000,"大师", "托尼");
	}
}
 