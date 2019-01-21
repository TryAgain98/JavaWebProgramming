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
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        while (true) {  
            System.out.println("");
             System.out.print("Nhập số nguyên có 3 chữ số n = ");
        
        n=input.nextInt();
        int so3=n%10;
        int so1=n/100;
        n=n/10;
        int so2=n%10;
        switch(so1){
            case 1 :System.out.print("Một trăm"); break;
            case 2 :System.out.print("Hai trăm");break;
            case 3 :System.out.print("Ba trăm");break;
            case 4 :System.out.print("Bốn trăm");break;
            case 5 :System.out.print("Năm trăm");break;
            case 6 :System.out.print("Sáu trăm");break;
            case 7 :System.out.print("Bảy trăm");break;
            case 8 :System.out.print("Tám trăm");break;
            case 9 :System.out.print("Chín trăm");break;
        }
        if(so2!=0&&so3!=0){
        switch(so2){
            case 0: System.out.print(" linh"); break;
            case 1: System.out.print(" mười"); break;
            case 2: System.out.print(" hai mươi"); break;
            case 3: System.out.print(" ba mươi"); break;
            case 4: System.out.print(" bốn mươi"); break;
            case 5: System.out.print(" năm mươi"); break;
            case 6: System.out.print(" sáu mươi"); break;
            case 7: System.out.print(" bảy mươi"); break;
            case 8: System.out.print(" tám mươi"); break;
            case 9: System.out.print(" chín mươi"); break;
        }
        switch(so3){
            case 1: System.out.print(" một \n"); break;
            case 2: System.out.print(" hai \n"); break;
            case 3: System.out.print(" ba \n"); break;
            case 4: System.out.print(" bốn \n"); break;
            case 5: System.out.print(" năm \n"); break;
            case 6: System.out.print(" sáu \n"); break;
            case 7: System.out.print(" bảy \n"); break;
            case 8: System.out.print(" tám \n"); break;
            case 9: System.out.print(" chín \n"); break;
        }
    }
        else if(so2==0){
            switch(so3){
            case 1: System.out.print(" linh một \n"); break;
        }
        }}
    }
}
