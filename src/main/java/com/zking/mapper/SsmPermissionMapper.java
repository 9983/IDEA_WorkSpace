package com.zking.mapper;

import com.zking.model.SsmPermission;

public interface SsmPermissionMapper {
    int deleteByPrimaryKey(Integer perId);

    int insert(SsmPermission record);

    int insertSelective(SsmPermission record);

    SsmPermission selectByPrimaryKey(Integer perId);

    int updateByPrimaryKeySelective(SsmPermission record);

    int updateByPrimaryKey(SsmPermission record);
}