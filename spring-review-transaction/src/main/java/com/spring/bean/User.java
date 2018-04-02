package com.spring.bean;

import java.io.Serializable;
import java.util.Date;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月29日 下午2:55:16 
* 类说明  User实体类
*/
public class User implements Serializable{
	
	private int id;
	private int age;
	private float hight;
	private double salary;
	private String username;
	private Date birthday;
	
	public User() {
		super();
	}

	public User(int id, int age, float hight, double salary, String username, Date birthday) {
		super();
		this.id = id;
		this.age = age;
		this.hight = hight;
		this.salary = salary;
		this.username = username;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", hight=" + hight + ", salary=" + salary + ", username=" + username
				+ ", birthday=" + birthday + "]";
	}
	
}
 