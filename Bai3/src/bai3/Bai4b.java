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
public class Bai4b {
    public static void main(String[] args) {
        int h;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập đọ cao h = ");
        h=input.nextInt();
        for(int i=0;i<h;i++){
            for(int j=0;j<2*h+1;j++){
                if(i==h-1&&h-i<j&&j<h+i){
                    System.out.print(" * ");
                }
                else if(h-i==j||j==h+i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
                
            }
            System.out.println("");
        }
    }
}
