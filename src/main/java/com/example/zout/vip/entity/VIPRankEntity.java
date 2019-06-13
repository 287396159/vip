package com.example.zout.vip.entity;

/**
 *@class_name：VIPRankEntity  
 *@param: vip等级类》对应vip_rank表
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
public class VIPRankEntity {
	
	private int code;
	private String name;
	private String remark;
	private int needAmount;
	private int discount;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getNeedAmount() {
		return needAmount;
	}
	public void setNeedAmount(int needAmount) {
		this.needAmount = needAmount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "VIPRankEntity [code=" + code + ", name=" + name + ", remark=" + remark + ", needAmount=" + needAmount
				+ ", discount=" + discount + "]";
	}


}
