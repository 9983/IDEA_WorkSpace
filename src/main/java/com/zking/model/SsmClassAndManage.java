package com.zking.model;

import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.util.Date;

@ToString
@Repository
public class SsmClassAndManage {
    private Integer camId;

    private String camName;

    private Integer camCourseId;

    private Integer camTeacherId;

    private Integer camState;

    private Date camCreatetime;

    private Integer camStuId;

    public SsmClassAndManage(Integer camId, String camName, Integer camCourseId, Integer camTeacherId, Integer camState, Date camCreatetime, Integer camStuId) {
        this.camId = camId;
        this.camName = camName;
        this.camCourseId = camCourseId;
        this.camTeacherId = camTeacherId;
        this.camState = camState;
        this.camCreatetime = camCreatetime;
        this.camStuId = camStuId;
    }

    public SsmClassAndManage() {
        super();
    }

    public Integer getCamId() {
        return camId;
    }

    public void setCamId(Integer camId) {
        this.camId = camId;
    }

    public String getCamName() {
        return camName;
    }

    public void setCamName(String camName) {
        this.camName = camName;
    }

    public Integer getCamCourseId() {
        return camCourseId;
    }

    public void setCamCourseId(Integer camCourseId) {
        this.camCourseId = camCourseId;
    }

    public Integer getCamTeacherId() {
        return camTeacherId;
    }

    public void setCamTeacherId(Integer camTeacherId) {
        this.camTeacherId = camTeacherId;
    }

    public Integer getCamState() {
        return camState;
    }

    public void setCamState(Integer camState) {
        this.camState = camState;
    }

    public Date getCamCreatetime() {
        return camCreatetime;
    }

    public void setCamCreatetime(Date camCreatetime) {
        this.camCreatetime = camCreatetime;
    }

    public Integer getCamStuId() {
        return camStuId;
    }

    public void setCamStuId(Integer camStuId) {
        this.camStuId = camStuId;
    }
}