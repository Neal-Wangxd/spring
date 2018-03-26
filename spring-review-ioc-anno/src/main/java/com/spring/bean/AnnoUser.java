package com.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月26日 上午10:45:59 
* 类说明  用户实体类
*/

@Component(value="annoUser")
@Scope(value="singleton") //scope="singleton"  单实例 scope="prototype"  多实例
public class AnnoUser {

	private String name;
	private int age;
	private double salary;
	
	@Override
	public String toString() {
		return "AnnoUser [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public AnnoUser() {
		super();
	}
	public AnnoUser(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
 