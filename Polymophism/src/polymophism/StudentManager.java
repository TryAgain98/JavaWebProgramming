/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophism;

import java.util.Locale;
import org.w3c.dom.css.Counter;
import sun.font.TrueTypeFont;

/**
 *
 * @author Pc Of Huy Toan
 */
public class StudentManager extends Manager {

    private static final int MAX = 20;
    
    public StudentManager() {
        arr = new Student[MAX];
    }
    
    @Override
    public void add() {
        Student s = new Student();
        s.input();
        arr[count] = s;
        count++;
    }

    @Override
    public void search(String name) {
        boolean check=false;
        for(int i=0;i<count;i++){
            if(arr[i].getName().equals(name)){
                check=true;
                System.out.println(arr[i]);
            }
           
        }
        if(check==true){
            System.out.println("Tìm thấy");
            
        }
        else System.out.println(" ko tìm thấy");
    }

    @Override
    public void show() {
        
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

}
