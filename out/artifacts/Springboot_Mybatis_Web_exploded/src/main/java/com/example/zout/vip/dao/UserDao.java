package com.example.zout.vip.dao;


import com.example.zout.common.AbstractDao;
import com.example.zout.vip.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 *@class_name：UserDao  
 *@param:2.用户dao层
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月14日
 */
@Repository
public interface UserDao extends AbstractDao<UserEntity> {
	/*传入一个账号，返回一个实体*/
	
}
