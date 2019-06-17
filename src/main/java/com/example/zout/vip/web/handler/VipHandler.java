package com.example.zout.vip.web.handler;


import com.example.zout.common.ThisSystemException;
import com.example.zout.vip.entity.VIPEntity;
import com.example.zout.vip.entity.VIPRankEntity;
import com.example.zout.vip.function.VIPFunction;
import com.example.zout.vip.web.handler.ao.VIPAo;
import com.example.zout.vip.web.handler.vo.VIPVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 *@class_name：VipHandler  
 *@param: VIP-controller层
 *@author:Zoutao
 *@createtime:2018年3月17日
 */
@Controller
public class VipHandler extends AbstractHandler {
    @Autowired
	VIPFunction fun;
    
    //get视图>>就是跳转到qry.jsp页面》这样做是使得能访问到web-inf下的jsp页面
    @RequestMapping(path="/vip/qry.do",method=RequestMethod.GET)
    public String qryView()throws Exception{
		return "vip/qry";
	}
    //post执行请求--相关的处理操作
    @RequestMapping(path="/vip/qry.do",method=RequestMethod.POST)
	public String qry(String code,HttpServletRequest  req )throws Exception{
	try{
		VIPEntity v = fun.queryVip(code);
		
		//通过vo类来获得要显示数据
		VIPVo vo=new VIPVo();
		vo.setAddress(v.getAddress());
		//转换成字符串来显示
		vo.setAge(String.valueOf(v.getAge()));
		vo.setAmount(String.valueOf(v.getAmount()/100.0));
		vo.setCode(v.getCode());
		vo.setEmail(v.getEmail());
		vo.setName(v.getName());
		vo.setQq(v.getQq());
		//需要把等级1》文字表述
//		VIPRankEntity rank=this.getRank(req,v.getRank());
		//TODO:查询vip级别
//		vo.setRank(rank.getName());
		vo.setRemark(v.getRemark());
		vo.setSex(v.isMale()?"男":"女");
		vo.setZip(v.getZip());
		req.setAttribute("v", vo);
	}catch(ThisSystemException e){
		req.setAttribute("message", e.getMessage());
	}
	return "vip/qry";
}
    //录入客户信息页面
    @RequestMapping(path="/vip/add.do",method=RequestMethod.GET)
	public String addView(){
		return "vip/add";
	}
	@RequestMapping(path="/vip/add.do",method=RequestMethod.POST)
	public String addVip(VIPAo ao, HttpServletRequest req)throws Exception{
		try{
			//1 业务方法执行
			@SuppressWarnings("unused")
			VIPEntity v=fun.addVip(ao);
			//2业务跳转
			//TODO:后期跳转到消费录入界面
			req.setAttribute("message", "录入成功!");
			return "vip/add";
		}catch(ThisSystemException e){
			req.setAttribute("message", e.getMessage());
		}
		return "vip/add";
	}
	
	 //vip消费信息页面--未写完
    @RequestMapping(path="/vip/xiaofei.do",method=RequestMethod.GET)
	public String xiaofeiView(){
		return "vip/xiaofei";
	}
	@RequestMapping(path="/vip/xiaofei.do",method=RequestMethod.POST)
	public String xiaofei(String code, HttpServletRequest req,Model model)throws Exception{

		try{
			VIPEntity v = fun.queryVip(code);

			model.addAttribute("v", v);
		}catch(ThisSystemException e){
			req.setAttribute("message", e.getMessage());
		}
		return "vip/xiaofei";
	}
	
}
