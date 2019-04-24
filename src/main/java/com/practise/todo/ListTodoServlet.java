package com.practise.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list-todo.do")
public class ListTodoServlet extends HttpServlet {

	private static final long serialVersionUID = -5066999875040411992L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        TodoService todoService = new TodoService();
        System.out.println("Retrieve and display To-Do List..");
        request.setAttribute("todoList",todoService.getTodoList());
        request.getRequestDispatcher("/WEB-INF/pages/todo.jsp").forward(request,response);
    }


}
