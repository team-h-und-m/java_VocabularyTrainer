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
import basis.AbstractLessonServlet;
import data.Word;
import java.util.List;
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
                LessonStrategy ls = new LessonStrategy();
                ls.setStrategy(new LessonOneWords());
                return ls.getLessonWordsFromLesson();
            }
            case "lesson2": {
                LessonStrategy ls = new LessonStrategy();
                ls.setStrategy(new LessonTwoWords());
                return ls.getLessonWordsFromLesson();
            }
        }
        return null;
    }
}
