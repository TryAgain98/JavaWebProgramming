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
public class Bai7 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int f0=1,f1=1,fn;

        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print(f0+"\t");
            }
            else if(i==1){
                System.out.print(f1+"\t");
            }
            else{
            fn=f1+f0;
            f0=f1;
            f1=fn;
            System.out.print(fn+"\t");}
        }
    }
}
