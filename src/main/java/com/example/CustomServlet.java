package com.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class CustomServlet extends HttpServlet {

    String message;

    public void init(){
        message = "Hi there";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        Solution solution = new Solution();
        PrintWriter out = response.getWriter();
        String word = request.getParameter("word");
        String text = request.getParameter("textForWord");




    }

    public void destroy(){

    }
}
