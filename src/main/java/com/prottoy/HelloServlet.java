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
        String email = req.getParameter("email");
        Long id=Long.parseLong(req.getParameter("id"));
        String password=req.getParameter("password");
        User user = new User(id,name, email,password);
        req.setAttribute("user", user);
        System.out.println(user.getEmail());
        req.getRequestDispatcher("hello.jsp").forward(req, resp);
    }
}
