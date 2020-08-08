package com.zking.mapper;

import com.zking.model.SsmRolePermission;

public interface SsmRolePermissionMapper {
    int deleteByPrimaryKey(Integer rpId);

    int insert(SsmRolePermission record);

    int insertSelective(SsmRolePermission record);

    SsmRolePermission selectByPrimaryKey(Integer rpId);

    int updateByPrimaryKeySelective(SsmRolePermission record);

    int updateByPrimaryKey(SsmRolePermission record);
}