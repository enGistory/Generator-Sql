package com.example.demo.mapper;

import com.example.demo.po.CqH0;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH0Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH0 record);

    int insertSelective(CqH0 record);

    CqH0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH0 record);

    int updateByPrimaryKey(CqH0 record);
}