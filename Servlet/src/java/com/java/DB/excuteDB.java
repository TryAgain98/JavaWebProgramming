/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class excuteDB {
    Connection conn;
    public excuteDB() throws ClassNotFoundException, SQLException {
        DBconnecter connector=new DBconnecter();
             conn=connector.getConnect();
    }
    
    public void insert(User user) throws ClassNotFoundException, SQLException{
        
        String sql="insert into khachhang(username,pass,email,fullname,address) values (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
         pstmt.setString(2, user.getPass());
          pstmt.setString(3, user.getFullName());
           pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getAddress());
            pstmt.executeUpdate();
            
        pstmt.close();
    }
    
    public void close() throws SQLException {
        conn.close();
    }
}
