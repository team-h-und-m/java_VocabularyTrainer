/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import data.LoginUser;
import data.User;

/**
 *
 * @author Hamza
 */
public class DAO {
    public static User login(LoginUser loginUser){
        User user = null;
        if(loginUser.getUsername().equals("hamza")){
            user = new User("hamza", "admin");
        } else if(loginUser.getUsername().equals("marcel")){
            user = new User("marcel","admin");
        } else if(loginUser.getUsername().equals("user")){
            user = new User("user","user");
        }
        return user;
    }
}
