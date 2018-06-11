package com.bjgoodwill.common;

import com.bjgoodwill.common.ExecuteResult;
import com.bjgoodwill.common.BaseController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


public class UserAuth implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object stu = session.getAttribute("student");
        if( stu == null ){

            //response.sendRedirect("/webapp1/index.jsp");
            //这句话的意思，是让浏览器用utf8来解析返回的数据
            response.setHeader("Content-type", "application/json;charset=UTF-8");
            //这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
            response.setCharacterEncoding("UTF-8");
            BaseController baseController=new BaseController();
            ExecuteResult executeResult= baseController.FromBoolean(false,0,"用户未登录");
            PrintWriter pw = response.getWriter();
            pw.write(baseController.ToJson(executeResult));
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
