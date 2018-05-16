package com.taxi.mapper;

import com.taxi.model.po.Cars;

public interface CarsMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Cars record);

    int insertSelective(Cars record);

    Cars selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKeyWithBLOBs(Cars record);

    int updateByPrimaryKey(Cars record);
}