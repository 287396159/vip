package com.example.zout.vip.function;


import com.example.zout.vip.entity.VIPEntity;
import com.example.zout.vip.web.handler.ao.VIPAo;
import org.springframework.transaction.annotation.Transactional;

/**
 *@class_name：VIPFunction  
 *@param:vip功能
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
public interface VIPFunction {
	
	/**
	 * vip客户查询
	 * @param code
	 * @return
	 * @throws Exception
	 */
	VIPEntity queryVip(String code)throws Exception;
	/**
	 * 录入VIP
	 * @param ao
	 * @return
	 * @throws Exception
	 */
	@Transactional
	VIPEntity addVip(VIPAo ao)throws Exception;
	

	

}
