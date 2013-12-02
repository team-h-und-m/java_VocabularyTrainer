/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LektionDaten;

import data.Word;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class LessonOneWords extends Lesson{
    
    @Override
    public void intializeWords() {
        listOfWords.add(new Word("Car", "Auto", ""));
        listOfWords.add(new Word("Bottle", "Flasche", ""));
        listOfWords.add(new Word("Lamp", "Lampe", ""));
        listOfWords.add(new Word("Window", "Fenster", ""));
        listOfWords.add(new Word("Chair", "Sessel", ""));
    }
}
