/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManager sm=new StudentManager();
        Student stud=new Student("Toan","ct010",20);
        sm.add(stud);
//        sm.showInfo();
//        sm.search("Toan");
System.out.println("=========Student Manager============");
int choice;
String name;
Scanner input=new Scanner(System.in);
        do {            
            System.out.println("Mời bạn chọn số");
        //choice=input.nextInt();
        choice=input.nextInt();
        if(choice==1)sm.showInfo();
        else if(choice==2){
                System.out.println("Nhập tên để tìm kiếm :");
                name=input.nextLine();
                name=input.nextLine();
                sm.search(name);
        }
        else if(choice==3){
            Student s=new Student("Hoang", "Hoang@gmail.com", 11);
            sm.add(s);
            
        }
        } while (choice!=4);
    }
    
}
