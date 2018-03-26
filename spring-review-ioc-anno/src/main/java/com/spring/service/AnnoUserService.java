package com.spring.service;

import javax.annotation.Resource;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

import com.spring.dao.AnnoUserDao;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 下午1:40:30 
* 类说明 
*/
@Service(value="userService")
public class AnnoUserService {
	
	//定义dao类型属性
	//在dao属性上使用注解完成对象注入
	//@Autowired
	//private AnnoUserDao dao;
	@Resource(name="userDao")
	private AnnoUserDao dao;
	
	//使用注解的方式时，不需要添加set方法
	public void addUser(){
		System.out.println("service------add");
		dao.addUser();
	}

}
 