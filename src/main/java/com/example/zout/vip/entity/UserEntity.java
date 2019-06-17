package com.example.zout.vip.entity;


import lombok.Data;

/**
 *@class_name：UserEntity  
 *@param: 1.用户实体类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月14日
 */
@Data
public class UserEntity {
	
	private String id;    //用户id-没用
	private String account; //编号
	private String password; //密码
	private String name;   //用户名
	private String email;   //邮箱

	

}
