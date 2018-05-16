package com.taxi.service.impl;

import com.taxi.global.HttpCode;
import com.taxi.global.HttpResult;
import com.taxi.mapper.AdminMapper;
import com.taxi.model.po.Admin;
import com.taxi.service.IAdminService;
import com.taxi.utils.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员个人信息相关业务实现类
 * Created by HDL on 2018/5/16.
 */
@Service("adminSerivce")
public class AdminServiceImpl implements IAdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public HttpResult adminLogin(Admin admin) {
        admin.setaPwd(MD5Encoder.fiveMD5Encode(admin.getaPwd()));
        HttpResult result = new HttpResult();
        int count = adminMapper.countByAdmin(admin);
        if (count == 1) {
            result.setCode(HttpCode.CODE_0);
            result.setMsg(HttpCode.MSG_0);
        } else {
            result.setCode(HttpCode.CODE_10001001);
            result.setMsg(HttpCode.MSG_10001001);
        }
        return result;
    }
}
