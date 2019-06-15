package com.example.zout.vip.entity;

import lombok.Data;

/**
 *@class_name：VIPRankEntity  
 *@param: vip等级类》对应vip_rank表
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
@Data
public class VIPRankEntity {
	
	private int code;
	private String name;
	private String remark;
	private int needAmount;
	private int discount;

}
