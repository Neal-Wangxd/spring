package com.spring.beanFactory;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 下午2:10:56 
* 类说明  实例工厂创建对象
*/
public class UserFactoryNom {

	
	//普通方法返回User对象
	public User getUser(){
		return new User();
	}
}
 