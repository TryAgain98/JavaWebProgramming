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
public class Bai10 {
    public static void main(String[] args) {
        int n,a,b=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int m=n;
        while(m!=0){
            a=m%10;
            b=b*10+a;
            m=m/10;
        }
        if(b==n){
            System.out.println(n+" là số đối xứng");
        }
        else
            System.out.println(n+" không phải số đối xứng");
    }
}
