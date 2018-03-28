package com.spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.service.UserService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月28日 下午1:58:09 
* 类说明  userAtion 类
*/
public class UserAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		ApplicationContext application = new ClassPathXmlApplicationContext("application.xml");
		UserService userService = (UserService) application.getBean("userService");
		System.out.println("【UserAction---------------】");
		userService.add();
		return NONE;
	}
}
 