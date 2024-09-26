package com.example.zout.vip.web.handler;


import com.example.zout.vip.dao.VIPRankDao;
import com.example.zout.vip.entity.VIPRankEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @class_name：AbstractHandler
 * @param: 取等级的抽象类
 * @return:
 * @author:Zoutao
 * @createtime:2018年3月17日
 */
public abstract class AbstractHandler {
    @Autowired
    private VIPRankDao dao;

    //获得vip等级
    public VIPRankEntity getRank(HttpServletRequest req, int rank) {
        @SuppressWarnings("unchecked")
        Map<Integer, VIPRankEntity> rankMap = (Map<Integer, VIPRankEntity>) req.getServletContext().getAttribute("RANKS-MAP");
        return rankMap.get(rank);
    }

    //查询vip等级--写mapper
    public void initVipRank(HttpServletRequest req) throws Exception {
        //查询全部
        List<VIPRankEntity> ranks = dao.selectAll();
        //放到map中
        Map<Integer, VIPRankEntity> ranksMap = new HashMap<>();
        for (VIPRankEntity r : ranks) {
            ranksMap.put(r.getCode(), r);
        }
        req.getServletContext().setAttribute("RANKS-MAP", ranksMap);
    }
}
