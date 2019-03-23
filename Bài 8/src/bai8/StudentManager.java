/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author Pc Of Huy Toan
 */
public class StudentManager {
    private Student[] listStudents=new Student[1];

    public StudentManager() {
    }
    
    public boolean add(Student stud){
       for(int i=0;i<listStudents.length;i++){
           listStudents[i]=stud;
       }
        for (int i = 0; i < listStudents.length; i++) {
            
        
        System.out.println("Name : "+listStudents[i].getName());
        System.out.println("EMaiL : "+listStudents[i].getEmail());
        System.out.println("Age  :"+listStudents[i].getAge());}
        return true;
    }
    public void search(String name){
        for(int i=0;i<listStudents.length;i++){
            if(listStudents[i].getName().equals(name)){
                showInfo();
            }
            else{
                System.out.println("Không có tên trong danh sách");
            }
        }
    }

    public void showInfo(){
        for (int i = 0; i < listStudents.length; i++) {
            System.out.printf(" Name\t"+" email\t"+" age\n");
            System.out.println(listStudents[i].getName()+"\t"+listStudents[i].getEmail()+"\t"+listStudents[i].getAge());
        }
    }
    
}
