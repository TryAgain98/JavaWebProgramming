/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class Student {
    private String rollnumber;
    private String name;
    private int dob;
    private String email;

    public Student() {
    }

    public Student(String rollnumber, String name, int dob, String email) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "rollnumber : "+rollnumber+"\tname : "+name+"\tdob : "+dob+"\temail : "+email; //To change body of generated methods, choose Tools | Templates.
    }
    public void input(){
    Scanner input=new Scanner(System.in);
        System.out.println("Nhập rollnumber : ");
        rollnumber=input.nextLine();
        System.out.println("Nhập name : ");
        name=input.nextLine();
        System.out.println("Nhập dob : ");
        dob=input.nextInt();
        input.nextLine();
        System.out.println("Nhập email : ");
        email=input.nextLine();
    
}
}
