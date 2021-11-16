package com.example.demo.mapper;

import com.example.demo.po.CqH1Sh;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH1ShMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH1Sh record);

    int insertSelective(CqH1Sh record);

    CqH1Sh selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH1Sh record);

    int updateByPrimaryKey(CqH1Sh record);
}