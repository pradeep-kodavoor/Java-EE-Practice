package com.practise.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {

    public void init(FilterConfig var1) throws ServletException{

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("URL Pattern: "+request.getRequestURI());
        System.out.println("Name in filter: "+request.getSession().getAttribute("name"));
        if (request.getSession().getAttribute("name") != null){
            System.out.println("Valid Session, Continue to next action");
            chain.doFilter(servletRequest,servletResponse);
        } else{
            System.out.println("Invalid Session, Redirecting to login page..");
            request.getRequestDispatcher("/login.do").forward(servletRequest,servletResponse);
        }
    }

    public void destroy(){

    }

}
