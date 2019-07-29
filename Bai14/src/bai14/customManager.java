/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TryAg
 */
public class customManager {
    public void insert() throws ClassNotFoundException, SQLException{
        Connec c=new Connec();
        Connection conn=c.getConnect();
        String sql="select * from khachhang ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println("id : "+rs.getInt("id"));
            System.out.println("name : "+rs.getString("name"));
        }
    }
}
