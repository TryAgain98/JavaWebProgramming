/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10_2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class Main {
    public static void main(String[] args) {
        SimpleVim sv=new SimpleVim("F:\\Toan\\T.txt");
        try {
            sv.writeFile();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
sv.checkContentFile();
sv.readFile();
//char ch = 't';
//        try{
//            System.out.println("Moi ban nhap 1 ky tu");
//            ch = (char) System.in.read();
//            if(Character.toString(ch).equals("a")){
//            if(ch=='a') System.exit(0);
//        }
//            if(ch=='a') System.exit(0);
//            System.out.println("Ky tu vua nhap:" + ch); // đưa lên đây để khi read() gặp lỗi nó sẽ không in ký tự mặc định.
//        }catch(Exception e){
//            System.out.println("Nhap loi!");
//        }        
    }
    
}
