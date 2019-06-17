package com.example.zout.vip.entity;


import lombok.Data;

/**
 *@class_name：VIPEntity  
 *@param: vip实体类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
@Data
public class VIPEntity {
	
	private String id;
	/**vip编号*/
	private String code;
	/**姓名*/
	private String name;
	/**性别*/
	private boolean male;
	/**年龄*/
	private int age;
	/**qq*/
	private String qq;
	/**email*/
	private String email;
	/**邮寄地址*/
	private String address;
	/**邮政编码*/
	private String zip;
	/**备注*/
	private String remark;
	/**vip等级*/
	private int rank;
	/**当前消费金额(分)*/
	private int amount;

}
