package com.example.demo.mapper;

import com.example.demo.po.CqCw;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqCwMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqCw record);

    int insertSelective(CqCw record);

    CqCw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqCw record);

    int updateByPrimaryKey(CqCw record);
}