/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Toan's PC
 */
public class checkUser {
    Connection con;

   
    
    public boolean check(User user) throws ClassNotFoundException, SQLException{
        connectorDB db=new connectorDB();
        this.con=db.getConnector();
        String sql="select * from user where username=? and pass=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
    
    public void addUser(User user) throws ClassNotFoundException, SQLException{
        connectorDB db=new connectorDB();
        this.con=db.getConnector();
        String sql="insert into user(username,pass) values(?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, user.getUsername());
        pstmt.setString(2, user.getPassword());
        pstmt.executeUpdate();
        
    }
}
