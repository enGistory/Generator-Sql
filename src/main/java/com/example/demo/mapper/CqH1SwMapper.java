package com.example.demo.mapper;

import com.example.demo.po.CqH1Sw;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqH1SwMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqH1Sw record);

    int insertSelective(CqH1Sw record);

    CqH1Sw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqH1Sw record);

    int updateByPrimaryKey(CqH1Sw record);
}