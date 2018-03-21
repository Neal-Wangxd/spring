package com.spring.beanFactory;

import com.spring.bean.User;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 上午11:51:44 
* 类说明  创建实体工厂类
*/
public class UserFactory {
	
	//静态方法返回User对象
	public static User getUser(){
		return new User();
	}
}
 