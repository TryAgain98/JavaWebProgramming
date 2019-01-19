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
public class Bai8 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap goc > ");
        double x = input.nextDouble(); // đơn vị là độ
        // đổi đơn vị sang rad
        double xRad = x * Math.PI / 180;
        
        double ERR = 0.0001;
        double dif = 0;
        double sinx = 0;
        int i = 0;
        do {
            dif = Math.pow(-1, i) * Math.pow(xRad, 2*i + 1) / factori2(2*i + 1);
            sinx += dif;
            i++;
            System.out.println("sin("+x+") = " + sinx);
            
        } while(Math.abs(dif) > ERR);
        
        System.out.println("");
        System.out.println("=================");
        System.out.println("sin("+x+") = " + sinx);
        System.out.println("sin("+x+") = " + Math.sin(xRad));
    }
    
    public static int factori(int n) {
        if (n == 0 || n == 1) return 1;
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
    public static long factori2(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factori2(n - 1);
    }
    
}