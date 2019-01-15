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
public class Bai6_2 {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập a = ");
        a=input.nextInt();
        System.out.print("\nNhap b = ");
        b=input.nextInt();
        int n=a>b?a:b;
            for (int i = n;; i++) {
                if(i%a==0&&i%b==0){
                    System.out.println("Bội chung nhỏ nhất là : "+i);
                    break;
                }
            }
    }
}
