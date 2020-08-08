package com.zking.model;

import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.util.Date;

@ToString
@Repository
public class SsmUser {
    private Integer userId;

    private String userName;

    private String userAccount;

    private String userPwd;

    private String userSalt;

    private Integer userState;

    private String userSex;

    private Integer userAge;

    private Date userDate;

    public SsmUser(Integer userId, String userName, String userAccount, String userPwd, String userSalt, Integer userState, String userSex, Integer userAge, Date userDate) {
        this.userId = userId;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPwd = userPwd;
        this.userSalt = userSalt;
        this.userState = userState;
        this.userSex = userSex;
        this.userAge = userAge;
        this.userDate = userDate;
    }

    public SsmUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }
}