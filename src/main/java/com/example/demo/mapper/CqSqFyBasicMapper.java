package com.example.demo.mapper;

import com.example.demo.po.CqSqFyBasic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqSqFyBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqSqFyBasic record);

    int insertSelective(CqSqFyBasic record);

    CqSqFyBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqSqFyBasic record);

    int updateByPrimaryKey(CqSqFyBasic record);
}