package com.zking.model;


import lombok.ToString;
import org.springframework.stereotype.Repository;

@ToString
@Repository
public class SsmUserRole {
    private Integer urId;

    private Integer urUserId;

    private Integer urRoleId;

    public SsmUserRole(Integer urId, Integer urUserId, Integer urRoleId) {
        this.urId = urId;
        this.urUserId = urUserId;
        this.urRoleId = urRoleId;
    }

    public SsmUserRole() {
        super();
    }

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public Integer getUrUserId() {
        return urUserId;
    }

    public void setUrUserId(Integer urUserId) {
        this.urUserId = urUserId;
    }

    public Integer getUrRoleId() {
        return urRoleId;
    }

    public void setUrRoleId(Integer urRoleId) {
        this.urRoleId = urRoleId;
    }
}