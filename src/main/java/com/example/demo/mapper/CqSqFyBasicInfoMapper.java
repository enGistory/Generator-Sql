package com.example.demo.mapper;

import com.example.demo.po.CqSqFyBasicInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqSqFyBasicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqSqFyBasicInfo record);

    int insertSelective(CqSqFyBasicInfo record);

    CqSqFyBasicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqSqFyBasicInfo record);

    int updateByPrimaryKey(CqSqFyBasicInfo record);
}