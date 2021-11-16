package com.example.demo.mapper;

import com.example.demo.po.CqSqFyBasicType2Mx;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqSqFyBasicType2MxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqSqFyBasicType2Mx record);

    int insertSelective(CqSqFyBasicType2Mx record);

    CqSqFyBasicType2Mx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqSqFyBasicType2Mx record);

    int updateByPrimaryKey(CqSqFyBasicType2Mx record);
}