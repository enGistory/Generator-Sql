package com.example.demo.mapper;

import com.example.demo.po.CqLc0;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqLc0Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqLc0 record);

    int insertSelective(CqLc0 record);

    CqLc0 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqLc0 record);

    int updateByPrimaryKey(CqLc0 record);
}