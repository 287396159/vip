package com.example.zout.vip.function;


import com.example.zout.vip.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

/**
 *@class_name：UserFunction  
 *@param: 4.用户service层--传入账号密码
 *@return: 实体对象
 *@author:Zoutao
 *@createtime:2018年3月14日
 */

public interface UserFunction {
	/**
	 *用户登录模块
	 *@param:account
	 *@param:password
	 *@return: 登录
	 *@author:Zoutao
	 *@createtime:2018年3月17日
	 */
	public UserEntity login(String account, String password)throws Exception;
	
	/*修改密码功能--注解》表示需要通过事务管理,这数据库才会更新*/
	@Transactional
    UserEntity updatePassword(String id, String oldPassword, String newPasswrod, String newPasswordConfirm)throws Exception;

	void regin(String password, String cpassword, String account, String email)throws Exception;

	/*查看个人信息功能--注解》表示需要通过事务管理,这数据库才会更新*/
	/*@Transactional--直接使用session
    UserEntity selectMyinf(String account)throws Exception;*/
}
