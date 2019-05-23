/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class xuly {

    connect c = new connect();
    Statement s;
    ResultSet rs;

    public void showName() throws ClassNotFoundException, SQLException {
        Connection con = c.con();
        s = con.createStatement();
        rs = s.executeQuery("select ten ,khoa from docgia order by khoa asc;");
        while (rs.next()) {
            System.out.println("");
            System.out.println(rs.getString("ten") + "\t\t" + rs.getString("khoa"));
        }
    }

    public void borrowBook(String name, String date) {
        try {
            Connection con = c.con();
            s = con.createStatement();
            String sql = "select d.ten from PHIEUMUON p join SACH s on s.masach = p.masach  join DOCGIA d on d.sothe = p.sothe where s.ten = '" + name + "' and p.ngaymuon = '" + date + "'";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("ten"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void borrowBook(String month) {
        try {
            Connection con = c.con();
            s = con.createStatement();
            String sql = "select d.sothe, d.ten, s.ten from PHIEUMUON p join SACH s on s.masach = p.masach join DOCGIA d on d.sothe = p.sothe where p.ngaymuon ='" + month + "'";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("d.ten")+"\t\t"+rs.getString("d.sothe")+"\t\t"+rs.getString("s.ten"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void notNull(){
        try {
            Connection con = c.con();
            s = con.createStatement();
            String sql = "select s.* from SACH s where s.masach not in (select masach from PHIEUMUON)";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("s.ten"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void countBook(String name){
        try {
            Connection con = c.con();
            s = con.createStatement();
            String sql = "select count(*) as 'soluong' from PHIEUMUON p join DOCGIA d on d.sothe = p.sothe  where d.ten ='"+name+"'";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString(1));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void notBook(){
         try {
            Connection con = c.con();
            s = con.createStatement();
            String sql = "select d.* from PHIEUMUON p join DOCGIA d on d.sothe = p.sothe where p.ngaytra is null";
            rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println("");
                System.out.println(rs.getString("ten")+"\t\t"+rs.getNString("sothe"));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(xuly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
