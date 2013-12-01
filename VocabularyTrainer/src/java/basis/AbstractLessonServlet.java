/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basis;

import data.Word;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public abstract class AbstractLessonServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Word> words = processRequest(req,resp);
        req.setAttribute("words", words);
        String url = "lessonView.jsp";
        forward("/WEB-INF/view/lesson/"+url,req,resp);
    }
    
    protected void forward(String url, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatch = req.getRequestDispatcher(url);
        dispatch.forward(req, resp);
    }

    protected abstract List<Word> processRequest(HttpServletRequest req, HttpServletResponse resp);
}
