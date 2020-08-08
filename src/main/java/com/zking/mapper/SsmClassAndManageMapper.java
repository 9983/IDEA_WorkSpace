package com.zking.mapper;

import com.zking.model.SsmClassAndManage;

public interface SsmClassAndManageMapper {
    int deleteByPrimaryKey(Integer camId);

    int insert(SsmClassAndManage record);

    int insertSelective(SsmClassAndManage record);

    SsmClassAndManage selectByPrimaryKey(Integer camId);

    int updateByPrimaryKeySelective(SsmClassAndManage record);

    int updateByPrimaryKey(SsmClassAndManage record);
}