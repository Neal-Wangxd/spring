package com.spring.dao;

import org.springframework.stereotype.Component;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 下午1:39:25 
* 类说明  用户dao类
*/
@Component(value="userDao")
public class AnnoUserDao {
	
	public void addUser(){
		System.out.println("dao------add");
	}
}
 