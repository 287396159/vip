package com.example.zout.vip.entity;


/**
 *@class_name：UserEntity  
 *@param: 1.用户实体类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月14日
 */
public class UserEntity {
	
	private String id;    //用户id-没用
	private String account; //编号
	private String password; //密码
	private String name;   //用户名
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + "]";
	}
}
