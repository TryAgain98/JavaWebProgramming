/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophism;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Student extends Person{
    private String email;

    public Student() {
    }

    public Student(String email, String id, String name) {
        super(id, name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void input(){
        Scanner input=new Scanner(System.in);
        super.input();
        System.out.println("Nhap email : ");
        email=input.nextLine();
    }

    @Override
    public String toString() {
         return super.toString()+"\temail : "+email; //To change body of generated methods, choose Tools | Templates.
    }
    
}
