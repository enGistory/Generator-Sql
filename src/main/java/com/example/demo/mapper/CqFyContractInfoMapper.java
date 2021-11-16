package com.example.demo.mapper;

import com.example.demo.po.CqFyContractInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqFyContractInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqFyContractInfo record);

    int insertSelective(CqFyContractInfo record);

    CqFyContractInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqFyContractInfo record);

    int updateByPrimaryKey(CqFyContractInfo record);
}