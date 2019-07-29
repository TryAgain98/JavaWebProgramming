package com.java.DB;


import com.java.DB.Student;
import com.java.DB.ConnectorDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TryAg
 */
public class StudentManager {
    private List<Student> list;
    private Connection con;

    public StudentManager() {
        try {
            list=new ArrayList<>();
            ConnectorDB dB=new ConnectorDB();
            con=dB.getConnector();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
    
    public List<Student> show() {
        String sql="select * from sinhvien";
        PreparedStatement pstmt;
        try {
            pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery();
             while(rs.next()){
            Student s=new Student();
            s.setHoTen(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            s.setId(rs.getInt("id"));
            list.add(s);
        }
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return list;
    }
    
    public void insertStudent(Student s){
        try {
            String insert="insert into sinhvien(hoten,khoa,lop) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(insert);
            pstmt.setString(1, s.getHoTen());
            pstmt.setString(2, s.getKhoa());
            pstmt.setString(3, s.getLop());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteStudent(int id){
        try {
            String delete="DELETE FROM sinhvien WHERE id="+id;
            PreparedStatement pstmt = con.prepareStatement(delete);
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void updateStudent(Student s){
        try {
            String update="UPDATE sinhvien SET hoten = ?, khoa = ?,lop=? where id="+s.getId();
            PreparedStatement pstmt = con.prepareStatement(update);
            pstmt.setString(1, s.getHoTen());
            pstmt.setString(2, s.getKhoa());
            pstmt.setString(3, s.getLop());
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public Student show(int id){
        String sql="select * from sinhvien where id="+id;
        PreparedStatement pstmt;
        Student s=new Student();
        try {
            pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery();
             while(rs.next()){
            
            s.setHoTen(rs.getString("hoten"));
            s.setKhoa(rs.getString("khoa"));
            s.setLop(rs.getString("lop"));
            s.setId(rs.getInt("id"));
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        return s;
        
        
    }
    
}
