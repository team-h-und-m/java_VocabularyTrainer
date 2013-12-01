/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author Hamza
 */
public class Word {
    private String english,deutsch,eingabe;
    private String direction; //English to German or German to English

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getDeutsch() {
        return deutsch;
    }

    public void setDeutsch(String deutsch) {
        this.deutsch = deutsch;
    }

    public String getEingabe() {
        return eingabe;
    }

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }
    
    public void setDirection(String direction){
        this.direction = direction;
    }
    
    public Word(){
    
    }
    
    public Word(String english, String deutsch, String eingabe){
        this.english = english;
        this.deutsch = deutsch;
        this.eingabe = eingabe;
    }
    
    public boolean isWrong(){
        switch (direction) {
            case "englishToGerman":
                if(eingabe == deutsch){
                    return true;
                }   break;
            case "germanToEnglish":
                if(eingabe == english){
                    return true;
                }   break;
        }
        return false;
    }
}
