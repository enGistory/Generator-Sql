package com.example.demo.mapper;

import com.example.demo.po.CqH1Xy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH1XyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH1Xy record);

    int insertSelective(CqH1Xy record);

    CqH1Xy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH1Xy record);

    int updateByPrimaryKey(CqH1Xy record);
}