/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg1;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số > ");
        a=input.nextInt();
        System.out.println("Kết quả");
        System.out.println(a+"^2="+a*a);
    }
    
}
