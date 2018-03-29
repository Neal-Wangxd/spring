package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午3:04:20 
* 类说明  book类的增强类
*/
@Component(value="myBook")
@Aspect
public class MyBook {

	//在方法上使用注解完成增强操作
	@Before(value = "execution(* com.spring.bean.Book.testAop(..))")
	public void before(){
		System.out.println("【前置增强--------------】");
	}
	
	@After(value = "execution(* com.spring.bean.Book.testAop(..))")
	public void after(){
		System.out.println("【后置增强--------------】");
	}
	
	@Around(value = "execution(* com.spring.bean.Book.testAop(..))")
	public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		//方法之前
		System.out.println("【方法之前--------------】");
		//执行被增强的方法
		proceedingJoinPoint.proceed();
		//方法之后
		System.out.println("【方法之后--------------】");
	}
}
 