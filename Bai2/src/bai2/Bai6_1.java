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
public class Bai6_1 {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập a = ");
        a=input.nextInt();
        System.out.print("\nNhap b = ");
        b=input.nextInt();
        int n=a>b?b:a;
            for (int i = n; i >0; i--) {
                if(a%i==0&&b%i==0){
                    System.out.println("ước chung lớn nhất là : "+i);
                    break;
                }
            }
    }
}
