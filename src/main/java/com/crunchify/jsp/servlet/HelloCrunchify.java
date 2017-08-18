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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PersonaJpaController controller=new PersonaJpaController();
    List<Persona> list = controller.findPersonaEntities();
    String json = new Gson().toJson(list);
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(json);
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        String surname=request.getParameter("surname");
        String phone=request.getParameter("phone");
        String mobile=request.getParameter("mobile");
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
        response.sendRedirect("Crunchify.jsp");
        }
}
