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
public class Bai5b {
    public static void main(String[] args) {
        int m,n;
        Scanner input=new Scanner(System.in);
        System.out.printf("Nhập chiều dài m = ");
        m=input.nextInt();
        System.out.printf("\nNhập chiều rộng n = ");
        n=input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0||i==n-1){
                System.out.print(" * ");
                }
                else if(j==0||j==m-1){
                    System.out.print(" * ");
                }
                else System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
