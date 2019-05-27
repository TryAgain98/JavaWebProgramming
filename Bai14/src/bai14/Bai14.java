/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("   QUIZ ONLINE   ");
            System.out.println("------------------");
            System.out.print("Enter Email: ");
            String email = input.nextLine();
            
            System.out.print("Enter Pass: ");
            String pass = input.nextLine();
            studentManager sm=new studentManager();
            Student s=sm.login(email,pass);
            if(s!=null){
                System.out.println("dang nhap thanh cong");
                if(sm.check_student_questions(s)==true){
                    System.out.println("you did the test. do you want to do it again? Y / N");
                    System.out.println("Your choice > ");
                    String check =input.nextLine();
                    if(check.toLowerCase().equals("y")){
                       sm.delete_student_questions(s);
                       questionManager qm=new questionManager();
                List<question> list=qm.getListQuestion();
                int countCorr = 0;
                int index = 1;
                for (question q : list) {
                    System.out.printf("Question %d/%d \n", index++, list.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = input.nextLine();
                    qm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorr++;
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorr, list.size());
                System.out.println("See Detail (Y/N)");
                String a=input.nextLine();
                if(a.toLowerCase().equals("y")){
                    sm.Detail_student_questions(s);
                }
                }
                    }
                else{
                questionManager qm=new questionManager();
                List<question> list=qm.getListQuestion();
                int countCorr = 0;
                int index = 1;
                for (question q : list) {
                    System.out.printf("Question %d/%d \n", index++, list.size());
                    System.out.println(q);
                    System.out.print("Your answer > ");
                    String answer = input.nextLine();
                    qm.addAnswer(s, q, answer);
                    if (answer.toLowerCase().equals(q.getCorrect().toLowerCase())) {
                        countCorr++;
                    }
                }
                System.out.println("Congratulation!");
                System.out.printf("Your result: %d/%d \n", countCorr, list.size());
                System.out.println("See Detail (Y/N)");
                String a=input.nextLine();
                if(a.toLowerCase().equals("y")){
                    sm.Detail_student_questions(s);
                }
                }
            }
            else {
                System.out.println("dang nhap that bai");
            }
            
    }
    
}
