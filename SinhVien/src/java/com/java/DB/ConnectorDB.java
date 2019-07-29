package com.java.DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TryAg
 */
public class ConnectorDB {
    public Connection getConnector() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr="jdbc:mysql://localhost:3306/sanpham?autoReconnect=true&useSSL=false";
        Connection conn = DriverManager.getConnection(connStr,"root","Toan0167");
        
        return conn;
    }
    
    
}
