package com.example.demo.mapper;

import com.example.demo.po.CqSqFyFileInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqSqFyFileInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqSqFyFileInfo record);

    int insertSelective(CqSqFyFileInfo record);

    CqSqFyFileInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqSqFyFileInfo record);

    int updateByPrimaryKey(CqSqFyFileInfo record);
}