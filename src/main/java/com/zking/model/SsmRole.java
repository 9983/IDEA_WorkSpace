package com.zking.model;

import lombok.ToString;
import org.springframework.stereotype.Repository;

@ToString
@Repository
public class SsmRole {
    private Integer roleId;

    private String roleName;

    public SsmRole(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public SsmRole() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}