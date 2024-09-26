package com.example.zout.vip.function.impl;


import com.example.zout.common.ThisSystemException;
import com.example.zout.common.ThisSystemUtil;
import com.example.zout.vip.dao.UserDao;
import com.example.zout.vip.entity.UserEntity;
import com.example.zout.vip.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.zout.common.AssertThrowUtil.*;


//静态导入工具类

/**
 * @class_name：UserFunctioImpl
 * @param:5.service层实现类
 * @return:
 * @author:Zoutao
 * @createtime:2018年3月14日
 */
@Service
public class UserFunctioImpl implements UserFunction {

	@Autowired
	UserDao udao;

	/* 实现登录模块 */
	@Override
	public UserEntity login(String account, String password) throws Exception {
		// 账号为空--$在工具类中定义
		account = $("账户不能为空哟!", account);
		password = $("密码不能为空哟!", password);

		UserEntity u = udao.select("account", account);
		// 不为空,继续判断
		if (u == null) {
			throw new ThisSystemException("账号不存在");
		}
		password = ThisSystemUtil.md5(password);
		if (!u.getPassword().equals(password)) {
			throw new ThisSystemException("密码错误");
		}


		// 账户正确
		return u;
	}

	/* 实现修改密码模块 */
	@Override
	public UserEntity updatePassword(String id, String oldPassword, String newPassword, String newPasswordConfirm)
			throws Exception {
		// 1.验证参数
		id = $("id不能为空", id);
		oldPassword = $("旧密码必须填写!", oldPassword);
		newPassword = $("新密码必须填写!", newPassword);
		newPasswordConfirm = $("确认密码必须填写!", newPasswordConfirm);
		System.out.println(newPassword + "-" + newPasswordConfirm);
		// 调用AssertThrowUtil工具类的方法
		assertEquals("两次密码不一致", newPassword, newPasswordConfirm);
		assertNotEquals("新密码和旧密码不能一样", oldPassword, newPassword);
		
		// 2.去数据库通过id找到用户
		UserEntity u = udao.select("id", id);
		/*
		 *用户不存在，抛出异常，交由AssertThrowUtil处理。
		 * if(u==null){ throw new ThisSystemException("无法找到用户"); }
		 */
		assertNotNull("无法找到用户", u);
		oldPassword = ThisSystemUtil.md5(oldPassword);
		// 3.验证旧密码
		assertEquals("旧密码不正确", u.getPassword(), oldPassword);
		// 4.更新密码》加密以后再传递
		newPassword = ThisSystemUtil.md5(newPassword);
		u.setPassword(newPassword);

		//更新修改后的密码
		udao.update(u);
		return u;
	}

	@Override
	public void regin(String password, String cpassword, String account, String email) throws Exception {
		assertEquals("两次密码不一致", password, cpassword);
		password = ThisSystemUtil.md5(password);
		udao.regin(account,password,email);

	}

	/* 实现查询个人信息模块 --直接使用session*/
  /*  public UserEntity selectMyinf(String account) throws Exception{
				//业务处理>根据用户名查询
    	UserEntity u = udao.getMyInf("account", account);
		if(u==null){
			throw new ThisSystemException("查询错误["+account+"]");
		}
	//3封装业务结果
	return u;
    }*/
}
