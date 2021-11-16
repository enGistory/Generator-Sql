package com.example.demo.mapper;

import com.example.demo.po.CqH1XyMx1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH1XyMx1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH1XyMx1 record);

    int insertSelective(CqH1XyMx1 record);

    CqH1XyMx1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH1XyMx1 record);

    int updateByPrimaryKey(CqH1XyMx1 record);
}