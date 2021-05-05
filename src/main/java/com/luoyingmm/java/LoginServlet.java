package com.luoyingmm.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.interfaces.RSAKey;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        if (username.equals("1")){
            req.getSession().setAttribute("VIP1",req.getSession().getId());
            resp.sendRedirect("/VIP1.jsp");
        }else if (username.equals("2")){
            req.getSession().setAttribute("VIP2",req.getSession().getId());
            resp.sendRedirect("/VIP2.jsp");
        }else if (username.equals("3")){
            req.getSession().setAttribute("VIP3",req.getSession().getId());
            resp.sendRedirect("/VIP3.jsp");
        }else if (username.equals("4")){
            req.getSession().setAttribute("VIP4",req.getSession().getId());
            resp.sendRedirect("/VIP4.jsp");
        }else {
            resp.sendRedirect("/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
