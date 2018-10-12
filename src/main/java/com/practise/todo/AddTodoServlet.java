package com.practise.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TodoService todoService = new TodoService();
        System.out.println(request.getParameter("todo"));
        todoService.addTodo(new Todo(request.getParameter("todo")));
        response.sendRedirect("list-todo.do");
    }
}
