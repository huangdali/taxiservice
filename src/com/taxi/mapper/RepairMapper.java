package com.taxi.mapper;

import com.taxi.model.po.Repair;

public interface RepairMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Repair record);

    int insertSelective(Repair record);

    Repair selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKeyWithBLOBs(Repair record);

    int updateByPrimaryKey(Repair record);
}