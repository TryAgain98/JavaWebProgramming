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
public class Bai6 {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhập a > ");
        a=input.nextInt();
        String c=(a%2==0) ? "a la so chan" : "a la so le";
        System.out.println("kết quả");
        System.out.println(c);
    }
}
