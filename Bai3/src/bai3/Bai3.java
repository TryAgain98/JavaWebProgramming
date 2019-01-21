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
public class Bai3 {
    public static void main(String[] args) {
        int a=100000;
        int b=200000;
        int c=500000;
        for (int i = 0; i <= 3000000/a; i++) {
            for (int j = 0; j <= 3000000/b; j++) {
                for (int k = 0; k <= 3000000/c; k++) {
                    if(i*a+j*b+k*c==3000000){
                        System.out.println("3000000 đổi thành : "+i+" tờ "+a+" , "+j+" tờ "+b+" , "+k+" tờ "+c);
                    }
                }
            }
        }

    }
}
