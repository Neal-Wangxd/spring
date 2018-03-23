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
	
	private String pname;
	
	public User(){
		
	}
	
	public void testUser(){
		System.out.println("测试User对象的创建**********");
	}
	
	public void testProperty(){
		System.out.println("使用有参构造注入属性:----"+name);
	}
	
	public void testSetUser(){
		System.out.println("使用SET注入属性:----"+name);
	}
	
	public void testPname(){
		System.out.println("使用P空间注入属性:----"+pname);
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, int age, String dept, String panem) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.pname = panem;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dept=" + dept + ", pname=" + pname +"]";
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	

}
 