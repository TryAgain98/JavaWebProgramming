/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
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
 * @author pc
 */
public class NewsModel {
    
    public int countNews() throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) FROM news");
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    
    public List<News> getNews(int limit, int offset) throws Exception, ClassNotFoundException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnection();
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM news LIMIT ? OFFSET ?");
        pstmt.setInt(1, limit);
        pstmt.setInt(2, offset);
        ResultSet rs = pstmt.executeQuery();
        List<News> list = new ArrayList<News>();
        while (rs.next()) {
            list.add(new News(rs.getInt("id"), rs.getString("title"), rs.getString("content"), rs.getInt("author_id"), rs.getString("summary")));
        }
        return list;
    }
    
    public List<News> showNews(){
         List<News> l=new ArrayList<>();
        try {
            String sql="select * from news";
            DBConnector db = new DBConnector();
            Connection conn = db.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
           
            while(rs.next()){
                News n=new News(rs.getInt("id"),rs.getString("title"), rs.getString("content"), rs.getInt("author"), rs.getString("summary"));
                l.add(n);
                
            }
            
        } catch (Exception e) {
           e.printStackTrace();
        } 
       return l;
    }
}