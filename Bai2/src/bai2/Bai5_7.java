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
public class Bai5_7 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        float s=0;
        for (float i = 0; i <=n; i++) {
            s=s+(2*i+1)/(2*i+2);
        }
        System.out.println("S = "+s);  
    }
}
