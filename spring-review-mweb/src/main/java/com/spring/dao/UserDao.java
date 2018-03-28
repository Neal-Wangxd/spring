package com.spring.dao;

import org.springframework.stereotype.Component;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月28日 下午2:01:43 
* 类说明 
*/
@Component(value="userDao")
public class UserDao {
	
	public void add(){
		System.out.println("【UserDao--------------】");
	}

}
 