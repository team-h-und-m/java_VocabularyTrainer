/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class Words {
    private List<Word> listOfWords = new ArrayList<>();
    private List<Word> wrongWords = new ArrayList<>();
    private List<Word> rightWords = new ArrayList<>();
    
    public void add(String english, String deutsch, String eingabe){
        listOfWords.add(new Word(english,deutsch,eingabe));
    }
    
    public void ifIsWrong(){
        for (Word word :listOfWords) {
            if(word.isWrong()){
                wrongWords.add(word);
            } else {
                rightWords.add(word);
            }
            
        }
    }
}
