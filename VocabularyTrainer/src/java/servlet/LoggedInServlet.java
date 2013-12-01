/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import data.LoginUser;
import data.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DAO;
import settings.Options;

/**
 *
 * @author Hamza
 */
public class LoggedInServlet extends basis.AbstractHttpSerlvet{

    @Override
    protected String processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        HttpSession session = handleSession(req,resp,Options.LOGGEDIN);
        
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        if(username.isEmpty() || password.isEmpty()){
            throw new ServletException("Username oder Passwort eingeben!");
        }
        
       /// if(!username.matches("A-Za-z0-9") && !password.matches("A-Za-z0-9")){
        //    throw new ServletException("Ungueltige zeichen");
       // }
        
        try{
        User user = DAO.login(new LoginUser(username, password));
        if(user == null){
            throw new Exception("Invalid username or password");
        }
        session.setAttribute("user", user);
        } catch(Exception e){
            session.setAttribute("status", e.getMessage());
            return "invalidLogin.jsp";
        }
        return "loggedIn.jsp";
    }
    
}
