package com.example.zout.vip.dao;


import com.example.zout.vip.entity.VIPRankEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @class_name：VIPRankDao
 * @param:2.vip等级dao
 * @return:
 * @author:Zoutao
 * @createtime:2018年3月17日
 */
@Repository
public interface VIPRankDao {
    //作为列表保存所有查询
    List<VIPRankEntity> selectAll() throws Exception;
}
