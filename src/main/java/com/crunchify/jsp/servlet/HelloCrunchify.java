package com.crunchify.jsp.servlet;
 
import DAO.PersonaJpaController;
import VO.Persona;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=(String) request.getParameter("name");
        String surname=(String) request.getParameter("surname");
        String phone=(String) request.getParameter("phone");
        String mobile=(String) request.getParameter("mobile");
        PersonaJpaController controller=new PersonaJpaController();
        Persona p=new Persona();
        p.setNombre(name);
        p.setApellido(surname);
        p.setTelefono(phone);
        p.setCelular(mobile);
        try {
            controller.create(p);
        } catch (Exception ex) {
            Logger.getLogger(HelloCrunchify.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
