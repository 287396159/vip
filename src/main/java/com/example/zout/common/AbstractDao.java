package com.example.zout.common;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *@class_name：AbstractDao  
 *@param: 数据库操作常用方法类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月16日
 */
public interface AbstractDao<T> {
		//增加方法
		void insert(T t)throws Exception;
		//删除方法--参数通过注解一下，mybatis会把它变为mapper样式传递。
		void delete(@Param("key") String ukfield, @Param("value") Object value)throws Exception;
		//修改方法
		void update(T t)throws Exception;
		//个人信息查询--直接使用session
		//T getMyInf(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
		
		//三种查询方法--vipDaoMapper
		T select(@Param("key") String ukfield, @Param("value") Object value)throws Exception;
		boolean exsits(@Param("key") String ukfield, @Param("value") Object value)throws Exception;
		List<T> selectLike(@Param("key") String key)throws Exception;



}
