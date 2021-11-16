package com.example.demo.mapper;

import com.example.demo.po.CqFyContractImport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CqFyContractImportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqFyContractImport record);

    int insertSelective(CqFyContractImport record);

    CqFyContractImport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqFyContractImport record);

    int updateByPrimaryKey(CqFyContractImport record);
}