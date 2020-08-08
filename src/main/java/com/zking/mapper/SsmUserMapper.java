package com.zking.mapper;

import com.zking.model.SsmUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsmUserMapper {


    /**
     * 根据id删除
     * @param userId
     * @return
     */
    int deleteByPrimaryKey(Integer userId);


    /**
     * 插入所有
     * @param record
     * @return
     */
    int insert(SsmUser record);


    /**
     * 根据传入的参数进行插入
     * @param record
     * @return
     */
    int insertSelective(SsmUser record);


    /**
     *根据id查询单个
     * @param userId
     * @return
     */
    SsmUser selectByPrimaryKey(@Param("userId") Integer userId);

    /**
     * 根据传过来的值进行修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SsmUser record);


    /**
     * 查询全部
     * @return
     */
    List<SsmUser> selectSsmUserAll();


   /* *//**
     * 修改全部
     * @param record
     * @return
     *//*
    int updateByPrimaryKey(SsmUser record);*/
}