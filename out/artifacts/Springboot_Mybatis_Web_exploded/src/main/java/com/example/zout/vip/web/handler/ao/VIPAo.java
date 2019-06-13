package com.example.zout.vip.web.handler.ao;


/**
 *@class_name：VIPAo  
 *@param:
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
public class VIPAo {
	
	/**手机号*/
	private String phone;
	/**姓名*/
	private String name;
	/**性别*/
	private String sex;
	/**年龄*/
	private String age;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "VIPAo [phone=" + phone + ", name=" + name + ", sex=" + sex + ", age=" + age + ", qq=" + qq + ", email="
				+ email + ", address=" + address + ", zip=" + zip + ", remark=" + remark + "]";
	}

}
