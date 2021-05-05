package com.luoyingmm.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterLogin implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        if (request.getSession().getAttribute("VIP1") == null && request.getSession().getAttribute("VIP2") == null && request.getSession().getAttribute("VIP3") == null && request.getSession().getAttribute("VIP4") == null){
            response.sendRedirect("/index.jsp");
        }
        filterChain.doFilter(req,response);
    }

    @Override
    public void destroy() {

    }
}
