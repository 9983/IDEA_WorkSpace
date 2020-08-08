package com.zking.service.impl;

import com.zking.mapper.SsmUserMapper;
import com.zking.model.SsmUser;
import com.zking.service.ISsmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SsmUserServiceImpl implements ISsmUserService {

    @Autowired
    private SsmUserMapper ssmUserMapper;


    @Override
    public int deleteByPrimaryKey(Integer userId) {

        return ssmUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(SsmUser record) {
        return ssmUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SsmUser record) {
        return ssmUserMapper.insertSelective(record);
    }

    @Override
    public SsmUser selectByPrimaryKey(Integer userId) {
        System.out.println("ssmUser查询方法实现类--调用");
        return ssmUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(SsmUser record) {


        return ssmUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SsmUser> selectSsmUserAll() {
        return ssmUserMapper.selectSsmUserAll();
    }
}
