package com.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.AnnoUser;
import com.spring.service.BookService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 下午2:51:04 
* 类说明  注解和配置文件混合使用测试
*/
public class BookServiceTest {
	
	@Test
	public void bookTest(){
		//加载spring配置文件，创建对象
		ApplicationContext application = new ClassPathXmlApplicationContext("anno.xml");
		//得到配置文件中对象的ID
		BookService bookService = (BookService) application.getBean("bookService");
		System.out.println(bookService.hashCode());
		bookService.book();
	}

}
 