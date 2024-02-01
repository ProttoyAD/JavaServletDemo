package com.prottoy;

import com.prottoy.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        User user = new User(name, age);
        req.setAttribute("user", user);
        req.getRequestDispatcher("hello.jsp").forward(req, resp);
    }
}
