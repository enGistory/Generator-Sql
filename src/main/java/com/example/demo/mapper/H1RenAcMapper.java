package com.example.demo.mapper;

import com.example.demo.po.H1RenAc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface H1RenAcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(H1RenAc record);

    int insertSelective(H1RenAc record);

    H1RenAc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(H1RenAc record);

    int updateByPrimaryKey(H1RenAc record);
}