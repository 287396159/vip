package com.example.zout.vip.dao;


import com.example.zout.common.AbstractDao;
import com.example.zout.vip.entity.VIPEntity;
import org.springframework.stereotype.Repository;

/**
 *@class_name：VIPDao  
 *@param: vipdao层 继承 sql操作常用方法类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
@Repository
public interface VIPDao extends AbstractDao<VIPEntity> {
    
}

