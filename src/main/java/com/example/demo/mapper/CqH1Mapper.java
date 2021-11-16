package com.example.demo.mapper;

import com.example.demo.po.CqH1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH1 record);

    int insertSelective(CqH1 record);

    CqH1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH1 record);

    int updateByPrimaryKey(CqH1 record);
}