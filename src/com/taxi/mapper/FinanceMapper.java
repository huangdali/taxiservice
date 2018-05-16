package com.taxi.mapper;

import com.taxi.model.po.Finance;
import com.taxi.model.po.FinanceWithBLOBs;

public interface FinanceMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(FinanceWithBLOBs record);

    int insertSelective(FinanceWithBLOBs record);

    FinanceWithBLOBs selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(FinanceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FinanceWithBLOBs record);

    int updateByPrimaryKey(Finance record);
}