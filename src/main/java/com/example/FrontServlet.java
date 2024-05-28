package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/front")
public class FrontServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Front Servlet</h1><p>This is the Front Servlet.</p>");

        // Forward the request to HrServlet
        //req.getRequestDispatcher("/HrServlet").forward(req, resp);
    }
}
