/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

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
        int n;
        Scanner input=new Scanner(System.in);
        while (true) {            
        System.out.print("nhập số nguyên có 2 chữ số n = ");
        n=input.nextInt();
        int so2=n%10;
        int so1=n/10;
        if(so1==1){
            switch(so2){
                case 0 : System.out.println("Mười"); break;
                case 1 : System.out.println("Mười một"); break;
                case 2 : System.out.println("Mười hai"); break;
                case 3 : System.out.println("Mười ba"); break;
                case 4 : System.out.println("Mười bốn"); break;
                case 5 : System.out.println("Mười năm"); break;
                case 6 : System.out.println("Mười sáu"); break;
                case 7 : System.out.println("Mười bảy"); break;
                case 8 : System.out.println("Mười tám"); break;
                case 9 : System.out.println("Mười chín"); break;
            }
        }
        else{
        switch(so1){
                case 2 : System.out.print("Hai mươi"); break;
                case 3 : System.out.print("Ba mươi"); break;
                case 4 : System.out.print("Bốn Mươi"); break;
                case 5 : System.out.print("Năm mươi"); break;
                case 6 : System.out.print("Sáu mươi"); break;
                case 7 : System.out.print("Bảy mươi"); break;
                case 8 : System.out.print("Tám mươi"); break;
                case 9 : System.out.print("Chín mươi"); break;
            }
        switch(so2){
             case 1 : System.out.printf(" mốt\n"); break;
                case 2 : System.out.print(" Hai\n "); break;
                case 3 : System.out.print(" Ba\n"); break;
                case 4 : System.out.print(" Bốn\n "); break;
                case 5 : System.out.print(" Năm \n"); break;
                case 6 : System.out.print(" Sáu \n"); break;
                case 7 : System.out.print(" Bảy \n"); break;
                case 8 : System.out.print(" Tám \n"); break;
                case 9 : System.out.print(" Chín \n"); break;
            }
        
        }}
    }
    
}
