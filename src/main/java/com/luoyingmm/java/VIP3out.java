package com.luoyingmm.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VIP3out extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object VIP3 = req.getSession().getAttribute("VIP3");
        if (VIP3 != null) {
            req.getSession().removeAttribute("VIP3");
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