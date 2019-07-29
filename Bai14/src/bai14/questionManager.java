/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import com.mysql.cj.PreparedQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toan's PC
 */
public class questionManager {
    Connection conn;

    public questionManager() throws ClassNotFoundException, SQLException {
        Connec c=new Connec();
        this.conn=c.getConnect();
    }
    public List<question> getListQuestion() throws SQLException{
        Statement stmt = this.conn.createStatement();
        String query="select * from questions";
        ResultSet rs = stmt.executeQuery(query);
        List<question> list=new ArrayList<>();
        while(rs.next()){
            question q=new question();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswer_a(rs.getString("answer_a"));
            q.setAnswer_b(rs.getString("answer_b"));
            q.setAnswer_c(rs.getString("answer_c"));
            q.setAnswer_d(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            list.add(q);
        }
        return list;
    }
    public question getQuestion(int id) throws SQLException{
        Statement stmt = this.conn.createStatement();
        String query="select * from questions where id="+id;
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            question q=new question();
            q.setId(rs.getInt("id"));
            q.setContent(rs.getString("content"));
            q.setAnswer_a(rs.getString("answer_a"));
            q.setAnswer_b(rs.getString("answer_b"));
            q.setAnswer_c(rs.getString("answer_c"));
            q.setAnswer_d(rs.getString("answer_d"));
            q.setCorrect(rs.getString("correct"));
            return q;
        }
        question q=new question();
        return q;
    }
    
    public void addAnswer(Student s, question q,String answer) throws SQLException{
        String query="insert into student_questions values(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.setInt(2, q.getId());
        pstmt.setString(3, answer);
        pstmt.executeUpdate();
        
    }
}
