package com.zking.model;

import lombok.ToString;
import org.springframework.stereotype.Repository;

@ToString
@Repository
public class SsmRolePermission {
    private Integer rpId;

    private Integer rpRoleId;

    private Integer rpPerId;

    public SsmRolePermission(Integer rpId, Integer rpRoleId, Integer rpPerId) {
        this.rpId = rpId;
        this.rpRoleId = rpRoleId;
        this.rpPerId = rpPerId;
    }

    public SsmRolePermission() {
        super();
    }

    public Integer getRpId() {
        return rpId;
    }

    public void setRpId(Integer rpId) {
        this.rpId = rpId;
    }

    public Integer getRpRoleId() {
        return rpRoleId;
    }

    public void setRpRoleId(Integer rpRoleId) {
        this.rpRoleId = rpRoleId;
    }

    public Integer getRpPerId() {
        return rpPerId;
    }

    public void setRpPerId(Integer rpPerId) {
        this.rpPerId = rpPerId;
    }
}