package com.spring.service;

import javax.annotation.Resource;

import com.spring.dao.BookDao;
import com.spring.dao.OrderDao;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 下午2:34:05 
* 类说明 
*/
public class BookService {
	
	@Resource(name="bookDao")
	private BookDao bookDao;
	
	@Resource(name="orderDao")
	private OrderDao orderDao;
	
	public void book(){
		System.out.println("bookService..............");
		bookDao.book();
		orderDao.buy();
	}

}
 