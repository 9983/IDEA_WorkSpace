package com.zking.service;

import com.zking.model.SsmUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISsmUserService {


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
    @Transactional  //事务注解，一般用于方法的话是用在查询方法防止死锁,子类会自动继承这个接口
    SsmUser selectByPrimaryKey(Integer userId);

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


}
