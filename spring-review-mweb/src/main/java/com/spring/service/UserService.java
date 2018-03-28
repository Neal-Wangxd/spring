package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月28日 下午2:01:29 
* 类说明 
*/
@Service(value="userService")
public class UserService {

	@SuppressWarnings("restriction")
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void add(){
		System.out.println("【UserService--------------】");
		userDao.add();
	}
}
 