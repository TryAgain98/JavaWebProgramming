/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.DB.Connector;
import com.java.demo.dto.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toan
 */
public class BookManager {
    
    private Connection conn;
    public BookManager() throws ClassNotFoundException, SQLException {
         Connector db=new Connector();
          conn=db.getConnection();
    }
    
    
    public List<Book> show() throws SQLException{
        String sql="select * from book";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Book> l=new ArrayList<>();
        while(rs.next()){
            Book b=new Book();
            b.setId(rs.getInt("id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setPrice(rs.getDouble("price"));
            b.setQuantity(rs.getInt("quantity"));
            l.add(b);
            
        }
        return l;
    }
    
    public void delete(int id) throws SQLException{
        String sql="DELETE FROM book where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        
        
    }
    
    public void update(Book b) throws SQLException{
        
        String sql="UPDATE Book SET title=?, author=?,price=?,quantity=? where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1,b.getTitle() );
        pstmt.setString(2, b.getAuthor());
        pstmt.setDouble(3, b.getPrice());
        pstmt.setInt(4, b.getQuantity());
        pstmt.setInt(5, b.getId());
        pstmt.executeUpdate();
    }
    
    public Book showID(int id) throws SQLException{
        String sql="select * from book where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        Book b=new Book();
        b.setId(rs.getInt("id"));
        b.setTitle(rs.getString("title"));
        b.setAuthor(rs.getString("author"));
        b.setPrice(rs.getDouble("price"));
        b.setQuantity(rs.getInt("quantity"));
        return b;
        
    }
    
    public void add(Book b) throws SQLException{
        String sql="insert into book(title,author,price,quantity) values (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, b.getTitle());
        pstmt.setString(2, b.getAuthor());
        pstmt.setDouble(3, b.getPrice());
        pstmt.setInt(4, b.getQuantity());
        pstmt.executeUpdate();
        
    }
}
