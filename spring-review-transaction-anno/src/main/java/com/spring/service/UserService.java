package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bean.User;
import com.spring.dao.UserDao;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月30日 上午11:14:15 
* 类说明 
*/
@SuppressWarnings("restriction")
@Service(value="userService")
@Transactional
public class UserService {
	
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	//添加
	public void add(User user){
		System.out.println("【UserService------------add】");
		userDao.add(user);
	}
	
	//修改
	public void update(User user){
		System.out.println("【UserService------------update】");
		userDao.update(user);
	}
	
	//删除
	public void delete(int id){
		System.out.println("【UserService------------delete】");
		userDao.delete(id);
	}
	
	//总数
	public int count(){
		System.out.println("【UserService------------count】");
		return userDao.count();
	}
	
	//获取单个User
	public User getUserByName(String name){
		System.out.println("【UserService------------getUser】");
		return userDao.getUserByName(name);
	}
	
	//获取用户列表
	public List<User> getUserList(){
		System.out.println("【UserService------------listUser】");
		return userDao.getUserList();
	}
	
	public void account(double salary,String addName,String lessName){
		System.out.println("【UserService------------account】");
		userDao.addMoney(salary, addName);
		int test = 10/0;
		userDao.lessMoney(salary, lessName);
	}

}
 