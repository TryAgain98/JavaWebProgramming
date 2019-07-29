/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Toan's PC
 */
public class Connec {
    public Connection getConnect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr="jdbc:mysql://localhost:3306/sanpham";
        Connection conn = DriverManager.getConnection(connStr,"root","Toan0167");
        
        return conn;
    }
}
