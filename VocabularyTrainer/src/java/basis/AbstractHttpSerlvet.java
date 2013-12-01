/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basis;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import settings.Options;

/**
 *
 * @author Hamza
 */
public abstract class AbstractHttpSerlvet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String view = processRequest(req, resp);
        forward("/WEB-INF/view/login/"+view, req,resp);
    }

    protected abstract String processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException;

    protected HttpSession handleSession(HttpServletRequest req, HttpServletResponse resp, Options option) {
        HttpSession session = req.getSession(false);
        switch(option){
            case LOGIN: session = getStartSession(req, resp); break;
            case LOGGEDIN: session = getLoggedInSession(req,resp);break;
            case CUSTOMISED: session = getCustomised(req,resp);break;
        }
        return session;
    }

    
    private void forward(String url, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatch = req.getRequestDispatcher(url);
        dispatch.forward(req, resp);
    }

    private HttpSession getStartSession(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession(false);
        if(session != null){
            System.out.println("Old Session: "+session.getId());
            session.invalidate();
        }
        session = req.getSession(true);
        System.out.println("New Session: "+session.getId());
        return session;
    }

    private HttpSession getLoggedInSession(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession(false);
        if(session == null){
            throw new IllegalStateException("To continue, you must login!");
        }
        return session;
    }

    private HttpSession getCustomised(HttpServletRequest req, HttpServletResponse resp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
