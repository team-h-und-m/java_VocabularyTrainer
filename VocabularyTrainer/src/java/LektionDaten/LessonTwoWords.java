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
public class LessonTwoWords extends Lesson{

    @Override
    public void intializeWords() {
        listOfWords.add(new Word("Speaker", "Sprecher", ""));
        listOfWords.add(new Word("Animal", "Tier", ""));
        listOfWords.add(new Word("Table", "Tisch", ""));
        listOfWords.add(new Word("Train", "Zug", ""));
        listOfWords.add(new Word("Run", "Laufen", ""));
    }
}
