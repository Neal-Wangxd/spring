package com.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
	
	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	
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
	
	public void testArrs(){
		System.out.println("使用数组注入属性:----"+arrs);
	}
	
	public void testList(){
		System.out.println("使用List注入属性:----"+list);
	}
	
	public void testMap(){
		System.out.println("使用Map注入属性:----"+map);
	}
	
	public void testProp(){
		System.out.println("使用Prop注入属性:----"+properties);
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(String name, int age, String dept, String pname, String[] arrs, List<String> list,
			Map<String, String> map, Properties properties) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.pname = pname;
		this.arrs = arrs;
		this.list = list;
		this.map = map;
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dept=" + dept + ", pname=" + pname + ", arrs="
				+ Arrays.toString(arrs) + ", list=" + list + ", map=" + map + ", properties=" + properties + "]";
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

	public String[] getArrs() {
		return arrs;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	

}
 