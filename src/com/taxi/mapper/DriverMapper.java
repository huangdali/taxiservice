package com.taxi.mapper;

import com.taxi.model.po.Driver;

public interface DriverMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Driver record);

    int insertSelective(Driver record);

    Driver selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Driver record);

    int updateByPrimaryKeyWithBLOBs(Driver record);

    int updateByPrimaryKey(Driver record);
}