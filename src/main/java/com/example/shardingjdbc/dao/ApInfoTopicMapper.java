package com.example.shardingjdbc.dao;

import com.example.shardingjdbc.entity.ApInfoTopic;

public interface ApInfoTopicMapper {
    int deleteByPrimaryKey(Integer topicId);

    int insert(ApInfoTopic record);

    int insertSelective(ApInfoTopic record);

    ApInfoTopic selectByPrimaryKey(Integer topicId);

    int updateByPrimaryKeySelective(ApInfoTopic record);

    int updateByPrimaryKey(ApInfoTopic record);
}