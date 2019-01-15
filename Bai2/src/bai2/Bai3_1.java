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
public class Bai3_1 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int ckeck=0;
        if(n<2){
            System.out.println(n+" không phải số nguyên tố");
        }
        else{
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if(n%i==0){
                    ckeck=1;
                    break;
                }
            }
            if(ckeck==1){
                System.out.println(n+" không phải số nguyên tố");
            }
            else
                System.out.println(n+" là số nguyên tố");
        }
    }
}
