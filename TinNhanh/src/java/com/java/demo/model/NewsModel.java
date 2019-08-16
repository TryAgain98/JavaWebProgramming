/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan
 */
public class NewsModel {
    private Connection conn;

    public NewsModel() {
        try {
            DBConnector dbc=new DBConnector();
            conn=dbc.getConnection();
        } catch (Exception e) {
           e.printStackTrace();
        } 
    }
    
    
    public List<News> showNews(int limit,int offset){
    String sql="select * from news LIMIT ? offset ?";
    List<News> l=new ArrayList<>();
        try {
        PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, limit);
      pstmt.setInt(2, offset);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            News n=new News(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getInt("author"), rs.getString("summary"));
            l.add(n);
            
        }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(NewsModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    return l;
}
    
     public int countNews() throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM news");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
     
     public int countSearch(String title) throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM news where title like '%"+title+"%'");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
     
     public List<News> search(String title) throws SQLException{
         String sql="select * from news where title like '%"+title+"%'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery();
        List<News> l=new ArrayList<>();
        while(rs.next()){
           News n=new News(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getInt("author"), rs.getString("summary"));
            l.add(n);
            
        }
         return l;
         
     }

   
}
