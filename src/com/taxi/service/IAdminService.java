package com.taxi.service;

import com.taxi.global.HttpResult;
import com.taxi.model.po.Admin;

/**
 * Created by HDL on 2018/5/16.
 */
public interface IAdminService {
    HttpResult adminLogin(Admin admin);
}
