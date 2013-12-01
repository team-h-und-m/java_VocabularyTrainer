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
public abstract class Lesson {
    public List<Word> listOfWords = new ArrayList<>();

    public List<Word> getListOfWords() {
        return listOfWords;
    }

    public void setListOfWords(List<Word> listOfWords) {
        this.listOfWords = listOfWords;
    }
}
