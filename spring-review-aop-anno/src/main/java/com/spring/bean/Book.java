package com.spring.bean;

import org.springframework.stereotype.Component;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午2:59:33 
* 类说明  book实体类
*/
@Component(value="book")
public class Book {
	
	private String name;
	private double price;
	private String author;
	
	public void testAop(){
		System.out.println("【Book----------------】");
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	public Book() {
		super();
	}
	public Book(String name, double price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
 