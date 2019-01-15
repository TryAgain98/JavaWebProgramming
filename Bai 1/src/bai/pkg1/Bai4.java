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
public class Bai4 {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.printf("nhập a > ");
        a=input.nextInt();
        System.out.printf("\nNhap b > ");
        b=input.nextInt();
        String c=a>b ?"a>b" :"a<b";
        System.out.println("Kết quả");
        System.out.println(c);
    }
}
