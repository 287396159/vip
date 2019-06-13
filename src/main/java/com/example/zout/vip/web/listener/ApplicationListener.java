package com.example.zout.vip.web.listener;


import com.example.zout.vip.dao.VIPRankDao;
import com.example.zout.vip.entity.VIPRankEntity;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *@class_name：ApplicationListener  
 *@param: 等级》文字的监听器==继承spring容器
 *@return: 把数据查询出来放到内存，方便使用
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
public class ApplicationListener extends ContextLoaderListener implements ServletContextListener {

		@Override
		public void contextDestroyed(ServletContextEvent event) {
			super.contextDestroyed(event);
		}

		@Override
		public void contextInitialized(ServletContextEvent evt) {
			super.contextInitialized(evt);
			
			ServletContext sc=evt.getServletContext();
			//初始化系统数据
			try{
			this.initVipRank(sc);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//查询vip等级--写mapper
		private void initVipRank(ServletContext sc)throws Exception{
			//获取到整个spring容器
			WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
			//获取dao对象，然后查询出来
			VIPRankDao rdao=ac.getBean(VIPRankDao.class);
			//查询全部
			List<VIPRankEntity> ranks = rdao.selectAll();
			//放到map中
			Map<Integer, VIPRankEntity> ranksMap=new HashMap<>();
			for (VIPRankEntity r : ranks) {
				ranksMap.put(r.getCode(), r);
			}
			sc.setAttribute("RANKS-MAP", ranksMap);
		}

}
