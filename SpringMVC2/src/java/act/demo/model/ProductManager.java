/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.demo.model;

import act.demo.DB.Connector;
import act.demo.dto.Customer;
import act.demo.dto.Products;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan
 */
public class ProductManager {

    private Connection conn;

    public ProductManager() {
        Connector db = new Connector();
        try {
            conn = db.getConnection();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public List<Products> show() throws SQLException {
        String sql = "SELECT  p.name as namesp,p.id as idSP, p.updated_at as updated_atSP, p.created_at as created_atSP,m.name as nameAuthor,p.images as images FROM products as p  JOIN member as m ON m.id=p.author_id;";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Products> l = new ArrayList<>();
        while (rs.next()) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");
            Products p = new Products();
            p.setId(rs.getInt("idSP"));
            p.setName(rs.getString("nameSp"));
            p.setAuthor_name(rs.getString("nameAuthor"));
            p.setImages(rs.getString("images"));

            p.setCreated_at(formatter.format(rs.getDate("created_atSP")) + rs.getTime("created_atSP"));
            if (rs.getDate("updated_atSP") != null) {
                p.setUpdated_at(formatter.format(rs.getDate("updated_atSP")));
            }
            l.add(p);
        }
        return l;
    }

    public List<Products> search(String name) throws SQLException {
        String sql = "SELECT  p.name as namesp,p.id as idSP, p.updated_at as updated_atSP, p.created_at as created_atSP,m.name as nameAuthor,p.images as images FROM products as p  JOIN member as m ON m.id=p.author_id  where p.name like '%"+name+"%' or m.name like '%"+name+"%'";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Products> l = new ArrayList<>();
        while (rs.next()) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy ");
            Products p = new Products();
            p.setId(rs.getInt("idSP"));
            p.setName(rs.getString("nameSp"));
            p.setAuthor_name(rs.getString("nameAuthor"));
            p.setImages(rs.getString("images"));

            p.setCreated_at(formatter.format(rs.getDate("created_atSP")) + rs.getTime("created_atSP"));
            if (rs.getDate("updated_atSP") != null) {
                p.setUpdated_at(formatter.format(rs.getDate("updated_atSP")));
            }
            l.add(p);
        }
        return l;

    }
    
    public void insertCustomer(Customer c) throws SQLException{
        String sql="insert into customer(name,email,password,birthday,address,phone,sex) values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, c.getName());
        pstmt.setString(2, c.getEmail());
        pstmt.setString(3, c.getPassword());
        pstmt.setDate(4, (Date) c.getBirthday());
        pstmt.setString(5, c.getAddress());
        pstmt.setInt(6, c.getPhone());
        pstmt.setString(7, c.getSex());
        pstmt.executeUpdate();
        
        
        
    }
}
