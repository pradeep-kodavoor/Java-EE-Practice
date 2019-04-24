package com.practise.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 4413137958724201793L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Logout, Invalidating the session!");
        request.getSession().invalidate();
        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request,response);
    }
}

