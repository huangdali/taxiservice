package com.taxi.mapper;

import com.taxi.model.po.Notice;
import com.taxi.model.po.NoticeWithBLOBs;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(NoticeWithBLOBs record);

    int insertSelective(NoticeWithBLOBs record);

    NoticeWithBLOBs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(NoticeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NoticeWithBLOBs record);

    int updateByPrimaryKey(Notice record);
}