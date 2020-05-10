/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;

/**
 *
 * @author hyousef
 */
class User implements Serializable{
    String userName;
    String passwd;

    public User(String userName, String passwd) {
        this.userName = userName;
        this.passwd = passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswd() {
        return passwd;
    }
    
    
    
    
    
}
