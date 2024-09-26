package com.example.zout.vip.dao;


import com.example.zout.common.AbstractDao;
import com.example.zout.vip.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
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
    void regin(@Param("account")String account, @Param("password")String password,  @Param("email")String email) throws Exception;
}
