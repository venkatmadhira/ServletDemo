package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/front/hr")
public class HrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>HR Servlet</h1><p>This is the HR Servlet.</p>");

        // Forward the request to ProjectServlet
       // req.getRequestDispatcher("/ProjectServlet").forward(req, resp);
    }
}
