package com.spring.service;

import com.spring.dao.UserDao;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 下午8:43:40 
* 类说明 
*/
public class UserService {
	
	//定义dao类型属性
	private UserDao dao;
	
	public void addUser(){
		System.out.println("service------add");
		dao.addUser();
	}
	//生成set方法
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
 