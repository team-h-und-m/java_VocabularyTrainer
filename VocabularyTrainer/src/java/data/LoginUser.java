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
public class LoginUser {    
    private String username, password;
    
    public LoginUser(){
    
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public LoginUser(String username, String password){
        this.username = username;
        this.password = password;
    }
}
