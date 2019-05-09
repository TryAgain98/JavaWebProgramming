/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class StudentManager {
    private List<Student> l;
    private File f;
        
    public StudentManager() {
        l=new ArrayList<>();
        f=new File("student.txt");
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void add(){
        Student s=new Student();
        s.input();
        l.add(s);
    }
     public void search(String name){
         for(Student st:l){
             if(st.getName().equals(name)){
                 System.out.println("Tìm thấy");
                 System.out.println(st);
             }
         }
     }
     public void delete(String name){
         for(Student st:l){
             if(st.getName().equals(name)){
                 l.remove(st);
                 System.out.println("xóa thành công");
             }
         }
     }
     public void saveFile(){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(l);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
     public void load(){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            List<Student> data=(List<Student>) ois.readObject();
            l=data;
            for(Student st:l){
                System.out.println(st);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void update(){
         
     }
     
}
