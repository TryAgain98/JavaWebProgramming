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
import java.util.List;

/**
 *
 * @author Toan's PC
 */
public class studentManager {
    Connection conn;

    public studentManager() throws ClassNotFoundException, SQLException {
        Connec c=new Connec();
        this.conn=c.getConnect();
    }
    public Student login(String email,String pass) throws SQLException{
        String sql="select * from students where email=? and pass=?";
        PreparedStatement pstmt = this.conn.prepareStatement(sql);
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        ResultSet rs = pstmt.executeQuery();
        Student s=null;
        if(rs.next()){
            s=new  Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),rs.getString("pass"));
        }
        return s;
    }
    
    public boolean check_student_questions(Student s) throws SQLException{
        String query="select * from student_questions where student_id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return true;
        }
        return false;
    }
    public void delete_student_questions(Student s) throws SQLException{
        String query="delete from student_questions where student_id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        pstmt.executeUpdate();
    }
    public void Detail_student_questions(Student s) throws SQLException, ClassNotFoundException{
        String query="SELECT * from ((student_questions as sq join students as s on s.id=sq.student_id) join questions as q on q.id=sq.question_id) where s.id=?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setInt(1, s.getId());
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            questionManager qm=new questionManager();
                List<question> list=qm.getListQuestion();

                    System.out.printf("Question %d/%d ", rs.getInt("sq.question_id"), list.size());
                                    if (rs.getString("sq.answer").toLowerCase().equals(rs.getString("q.correct").toLowerCase())) {
                        System.out.print(" - True \n");
                    }
                else{
                    System.out.print(" - False \n");
                }
                    System.out.println(rs.getString("q.content"));
                    System.out.println(rs.getString("q.answer_a"));
                    System.out.println(rs.getString("q.answer_b"));
                    System.out.println(rs.getString("q.answer_c"));
                    System.out.println(rs.getString("q.answer_d"));
                     System.out.println(" your choose > "+rs.getString("sq.answer"));
            
        }
        
        
    }
}
