package com.example.demo.mapper;

import com.example.demo.po.CqFyContract;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqFyContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqFyContract record);

    int insertSelective(CqFyContract record);

    CqFyContract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqFyContract record);

    int updateByPrimaryKey(CqFyContract record);
}