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
public class Bai2 {
     public static void main(String[] args) {
    float a,b,c;
    Scanner input=new Scanner(System.in);
    System.out.printf("nhập a > ");
    a=input.nextFloat();
    System.out.printf("\nNhap b > ");
    b=input.nextFloat();
    System.out.printf("\nNhap c > ");
    c=input.nextFloat();
    System.out.println("Kết quả");
    System.out.println("x = "+(c-b)/a);
    }
}
