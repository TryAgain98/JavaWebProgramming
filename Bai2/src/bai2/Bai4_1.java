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
public class Bai4_1 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=input.nextInt();
        int max=n;
        while(n!=0){
            System.out.print("Nhập n = ");
            n=input.nextInt();
            if(n>max){
                max=n;
            }
        }
        System.out.println("Số lớn nhất là : "+max);
    }
}
