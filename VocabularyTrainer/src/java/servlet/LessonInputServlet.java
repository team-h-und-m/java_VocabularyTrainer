/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import LektionDaten.Lesson;
import LektionDaten.LessonOneWords;
import LektionDaten.LessonStrategy;
import LektionDaten.LessonTwoWords;
import data.Word;
import data.Words;
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
public class LessonInputServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int index = Integer.parseInt(req.getParameter("index"));
        String inputWord = req.getParameter("eingabe");
        LessonStrategy ls = new LessonStrategy();
        getLessonNumber(req,resp);
        
        ls.setStrategy(getLessonNumber(req,resp));
        
        List<Word> list = ls.getLessonWordsFromLesson();
        System.out.print(list);
        list.remove(index);
        list.add(index, new Word(list.get(index).getEnglish(),list.get(index).getDeutsch(), inputWord));
        
        ls.setLessonWords(list);
        
        List<Word> newList = ls.getLessonWordsFromLesson();
        req.setAttribute("newlist", newList);
        
        RequestDispatcher dispatch = req.getRequestDispatcher("WEB-INF/view/lesson/test.jsp");
        dispatch.forward(req, resp);
    }

    private Lesson getLessonNumber(HttpServletRequest req, HttpServletResponse resp) {
              String lessonNumber = req.getParameter("lessonNumber");
        switch (lessonNumber) {
            case "lesson1": {
                return new LessonOneWords();
            }
            case "lesson2": {
                return new LessonTwoWords();
            }
        }
        return null;
    }
    
}