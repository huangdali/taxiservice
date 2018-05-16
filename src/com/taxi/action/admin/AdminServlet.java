package com.taxi.action.admin;

import com.taxi.model.po.Admin;
import com.taxi.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 管理员信息信息相关
 * Created by HDL on 2018/5/16.
 */
@Controller
@RequestMapping("admin")
public class AdminServlet {
    @Autowired
    private IAdminService adminService;

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, Admin admin) throws IOException {
        System.out.println("请求登录了");
        adminService.adminLogin(admin);
    }
}
