package com.example.demo.mapper;

import com.example.demo.po.H1Ren;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface H1RenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(H1Ren record);

    int insertSelective(H1Ren record);

    H1Ren selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(H1Ren record);

    int updateByPrimaryKey(H1Ren record);
}