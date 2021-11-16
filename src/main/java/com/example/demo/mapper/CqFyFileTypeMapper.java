package com.example.demo.mapper;

import com.example.demo.po.CqFyFileType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqFyFileTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqFyFileType record);

    int insertSelective(CqFyFileType record);

    CqFyFileType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqFyFileType record);

    int updateByPrimaryKey(CqFyFileType record);
}