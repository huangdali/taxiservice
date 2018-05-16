package com.taxi.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 登录验证
 * Created by HDL on 2017/11/16.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    /**
     * 拦截并决定是否放行
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截了，下面开始决定是否放行" + handler);
        System.out.println("url+"+request.getRequestURI());
        if(request.getRequestURI().contains("login")){
            return true;
        }
        String username = (String) request.getSession().getAttribute("user");
        if (username == null) {
            System.out.println("没有登录，跳转到登录页面");
            //由于使用了iframe，使用下面方法跳转
            PrintWriter out = response.getWriter();
            out.write("<html>");
            out.write("<script>");
            out.write("window.open ('../login.jsp?info=unlogin','_top')");
            out.write("</script>");
            out.write("</html>");
            out.close();
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
