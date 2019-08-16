/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Toan
 */
public class DBConnector {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr="jdbc:mysql://localhost:3306/sanpham?autoReconnect=true&useSSL=false";
        Connection conn = DriverManager.getConnection(connStr,"root","Toan0167");
        
        return conn;
    }
            
}
