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
public class Bai5_10 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        System.out.print("S(x,"+n+") = ");
        for (int i = 1; i <= n; i++) {
            if(i==n){
                System.out.print("x^"+2*i);
            }
            else if(i==1){
            System.out.print("x + ");}
            else{
                System.out.print("x^"+2*i+" + ");
            }
        }
        System.out.println("");
    }
}
