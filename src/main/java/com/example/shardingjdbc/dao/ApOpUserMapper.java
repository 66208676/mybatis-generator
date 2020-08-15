package com.example.shardingjdbc.dao;

import com.example.shardingjdbc.entity.ApOpUser;

public interface ApOpUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(ApOpUser record);

    int insertSelective(ApOpUser record);

    ApOpUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(ApOpUser record);

    int updateByPrimaryKey(ApOpUser record);
}