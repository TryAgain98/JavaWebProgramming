/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

/**
 *
 * @author Toan's PC
 */
public class User {
    private String userName;
    private String pass;
    private String fullName;
    private String email;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
    }

    public User(String userName, String pass, String fullName, String email, String address) {
        this.userName = userName;
        this.pass = pass;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", pass=" + pass + ", fullName=" + fullName + ", email=" + email + ", address=" + address + '}';
    }
    
}
