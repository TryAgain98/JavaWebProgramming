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
public class Bai5_8 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int s=0;
        int factorial=1;
        for (int i = 1; i <=n; i++) {
            factorial=factorial*i;
            s=factorial+s;
        }
        System.out.println("S = "+s);  
    }
}
