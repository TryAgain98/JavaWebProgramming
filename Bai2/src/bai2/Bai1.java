/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

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
        float a,b,c,d;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhap a = ");
        a=input.nextFloat();
        System.out.print("\nNhap b = ");
        b=input.nextFloat();
        System.out.print("\nNhap c = ");
        c=input.nextFloat();
        d=b*b-4*a*c;
        if(d<0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if(d==0){
            System.out.println("Phương trình có nghiệm kép : x1=x2="+(-b/(a*2)));
        }
        
        else{
            System.out.println("Phương trình có 2 nghiệm phân biệt : ");
            System.out.println("x1 = "+(-b+Math.sqrt(d))/(2*a));
            System.out.println("x2 = "+(-b-Math.sqrt(d))/(2*a));
        }
        
    }
    
}
