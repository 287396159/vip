package com.example.zout.vip.web.handler;



import com.example.zout.vip.entity.VIPRankEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 *@class_name：AbstractHandler  
 *@param: 取等级的抽象类
 *@return: 
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
public abstract class AbstractHandler {

	//获得vip等级
	public VIPRankEntity getRank(HttpServletRequest req, int rank){
		@SuppressWarnings("unchecked")
		Map<Integer, VIPRankEntity> rankMap=(Map<Integer, VIPRankEntity>)req.getServletContext().getAttribute("RANKS-MAP");
		return rankMap.get(rank);
	}
}
