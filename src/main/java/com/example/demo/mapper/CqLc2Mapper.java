package com.example.demo.mapper;

import com.example.demo.po.CqLc2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqLc2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqLc2 record);

    int insertSelective(CqLc2 record);

    CqLc2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqLc2 record);

    int updateByPrimaryKey(CqLc2 record);
}