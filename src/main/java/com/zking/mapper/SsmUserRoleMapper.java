package com.zking.mapper;

import com.zking.model.SsmUserRole;

public interface SsmUserRoleMapper {
    int deleteByPrimaryKey(Integer urId);

    int insert(SsmUserRole record);

    int insertSelective(SsmUserRole record);

    SsmUserRole selectByPrimaryKey(Integer urId);

    int updateByPrimaryKeySelective(SsmUserRole record);

    int updateByPrimaryKey(SsmUserRole record);
}