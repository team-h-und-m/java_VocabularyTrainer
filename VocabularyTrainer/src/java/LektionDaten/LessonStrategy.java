/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LektionDaten;

import data.Word;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class LessonStrategy {
    Lesson lesson = null;
    
    public List<Word> getLessonWordsFromLesson(){
        lesson.intializeWords();
        return lesson.getListOfWords();
    }

    public void setLessonWords(List<Word> list){
        lesson.setListOfWords(list);
    }
    
    public Lesson getLesson() {
        return lesson;
    }
    
    public void setStrategy(Lesson lesson){
        this.lesson = lesson;
    }
}
