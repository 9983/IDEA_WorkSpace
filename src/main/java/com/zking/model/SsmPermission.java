package com.zking.model;

import lombok.ToString;
import org.springframework.stereotype.Repository;

@ToString
@Repository
public class SsmPermission {
    private Integer perId;

    private String perName;

    private String pid;

    private String perPermission;

    private String perExplain;

    public SsmPermission(Integer perId, String perName, String pid, String perPermission, String perExplain) {
        this.perId = perId;
        this.perName = perName;
        this.pid = pid;
        this.perPermission = perPermission;
        this.perExplain = perExplain;
    }

    public SsmPermission() {
        super();
    }

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPerPermission() {
        return perPermission;
    }

    public void setPerPermission(String perPermission) {
        this.perPermission = perPermission;
    }

    public String getPerExplain() {
        return perExplain;
    }

    public void setPerExplain(String perExplain) {
        this.perExplain = perExplain;
    }
}