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
public class Bai9 {
    public static void main(String[] args) {
        double x;
        System.out.print("nhập x = ");
        Scanner input=new Scanner(System.in);
        x=input.nextDouble();
        double radx=x*Math.PI/180;
        double error=0.0001;//ko dùng đk float
        double ss=0;
        double cosx=0;
        double i=0;
        do {            
            ss=Math.pow(-1, i)*Math.pow(radx, 2*i)/factorri(2*i);
            cosx +=ss;
            i++;
            System.out.printf("\nCos(%f) = %f",x,cosx);
            
        } while (Math.abs(ss)>error);
        System.out.println("");
        System.out.println("====================");
        System.out.printf("\nCos(%f) = %f\n",x,cosx);
    }
    public static double factorri(double n){
        if(n==0||n==1) return  1;
        double gt=1;
        for (double i = n; i > 0; i--) {
            gt=gt*i;
        }
        return  gt;
    }
}
