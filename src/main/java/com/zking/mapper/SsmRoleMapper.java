package com.zking.mapper;

import com.zking.model.SsmRole;

public interface SsmRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(SsmRole record);

    int insertSelective(SsmRole record);

    SsmRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(SsmRole record);

    int updateByPrimaryKey(SsmRole record);
}