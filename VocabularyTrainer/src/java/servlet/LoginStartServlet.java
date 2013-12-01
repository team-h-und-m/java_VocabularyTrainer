/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hamza
 */
public class LoginStartServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String view = processRequest(req, resp);
        forward("/WEB-INF/view/login/"+view, req, resp);
    }

    private void forward(String string, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatch = req.getRequestDispatcher(string);
        dispatch.forward(req, resp);
    }

    private String processRequest(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = handleSession(req,resp);
        return "Login.jsp";
    }

    private HttpSession handleSession(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession(false);
        if(session != null){
            System.out.println("Old Session: "+session.getId());
            session.invalidate();
        }
        session = req.getSession(true);
        System.out.println("New Session: "+session.getId());
        return session;
    }
    
    
    
}
