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
public class Bai3_2 {
    public static void main(String[] args) {
        int n;
        int count=0;
        int m=2;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        while(count!=n){
            int ckeck=0;
                for (int i = 2; i <=Math.sqrt(m); i++) {
                if(m%i==0){
                    ckeck=1;
                }
            }
            if(ckeck==0){
                System.out.println(m);
                count++;
            }
            m++;
    }
}
}