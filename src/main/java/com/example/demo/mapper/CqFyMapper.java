package com.example.demo.mapper;

import com.example.demo.po.CqFy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqFyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqFy record);

    int insertSelective(CqFy record);

    CqFy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqFy record);

    int updateByPrimaryKey(CqFy record);
}