package com.taxi.mapper;

import com.taxi.model.po.OrderCar;

public interface OrderCarMapper {
    int deleteByPrimaryKey(String oId);

    int insert(OrderCar record);

    int insertSelective(OrderCar record);

    OrderCar selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(OrderCar record);

    int updateByPrimaryKeyWithBLOBs(OrderCar record);

    int updateByPrimaryKey(OrderCar record);
}