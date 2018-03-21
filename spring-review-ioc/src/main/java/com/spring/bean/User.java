package com.spring.bean; 
/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月21日 上午10:23:24 
* 类说明  用户实体类
*/
public class User {
	
	private String name;
	private int age;
	private String dept;
	
	public User(){
		
	}
	
	public void testUser(){
		System.out.println("测试User对象的创建**********");
	}
	
	public User(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dept=" + dept + "]";
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
 