package com.luoyingmm.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VIP2out extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object vip2 = req.getSession().getAttribute("VIP2");
        if (vip2 != null) {
            req.getSession().removeAttribute("VIP2");
            resp.sendRedirect("/index.jsp");
        } else {
            resp.sendRedirect("/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}