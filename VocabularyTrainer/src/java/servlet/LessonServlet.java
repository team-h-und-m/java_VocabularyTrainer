/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import LektionDaten.Lesson;
import LektionDaten.LessonOneWords;
import LektionDaten.LessonTwoWords;
import basis.AbstractLessonServlet;
import data.Word;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamza
 */
public class LessonServlet extends AbstractLessonServlet {

    @Override
    protected List<Word> processRequest(HttpServletRequest req, HttpServletResponse resp) {
        String lessonNumber = req.getParameter("lesson");
        switch (lessonNumber) {
            case "lesson1": {
                Lesson lesson = new LessonOneWords();
                return lesson.getListOfWords();
            }
            case "lesson2": {
                Lesson lesson = new LessonTwoWords();
                return lesson.getListOfWords();
            }
        }
        return null;
    }
}
