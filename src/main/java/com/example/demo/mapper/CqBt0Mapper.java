package com.example.demo.mapper;

import com.example.demo.po.CqBt0;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqBt0Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqBt0 record);

    int insertSelective(CqBt0 record);

    CqBt0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqBt0 record);

    int updateByPrimaryKey(CqBt0 record);
}