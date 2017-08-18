package com.crunchify.jsp.servlet;
 
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=(String) request.getAttribute("name");
        String surname=(String) request.getAttribute("surname");
        String phone=(String) request.getAttribute("phone");
        String mobile=(String) request.getAttribute("mobile");
        
        }
}
