package com.example.demo.mapper;

import com.example.demo.po.HousingCirculation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HousingCirculationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HousingCirculation record);

    int insertSelective(HousingCirculation record);

    HousingCirculation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HousingCirculation record);

    int updateByPrimaryKey(HousingCirculation record);
}