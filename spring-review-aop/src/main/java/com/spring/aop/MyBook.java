package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月27日 下午3:04:20 
* 类说明  book类的增强类
*/
public class MyBook {

	public void before(){
		System.out.println("【前置增强--------------】");
	}
	
	public void after(){
		System.out.println("【后置增强--------------】");
	}
	
	public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//方法之前
		System.out.println("【方法之前--------------】");
		//执行被增强的方法
		proceedingJoinPoint.proceed();
		//方法之后
		System.out.println("【方法之后--------------】");
	}
}
 