/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang1Chieu.Bai5;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class mang {
    private int [] arrayA;
    private int [] arrayB;
    private int [] arrayC;

    Scanner input=new Scanner(System.in);
    public int[] getArrayA() {
        return arrayA;
    }

    public void setArrayA(int[] arrayA) {
        this.arrayA = arrayA;
    }

    public int[] getArrayB() {
        return arrayB;
    }

    public void setArrayB(int[] arrayB) {
        this.arrayB = arrayB;
    }
    public void print(){
        System.out.println("arrayA : ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.printf("\t"+arrayA[i]);
        }
        System.out.println("");
         System.out.println("arrayB : ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.printf("\t"+arrayB[i]);
        }
        System.out.println("");
    }
    public void nhap(){
        arrayA=new int[3];
        arrayB=new int[3];
        System.out.println("Nhap arrayA ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("");
            arrayA[i]=input.nextInt();
        }
        System.out.println("Nhap arrayB ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("");
            arrayB[i]=input.nextInt();
        }
    }
    public void total(){
        arrayC=new  int[3];
        System.out.println("======================");
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i]=arrayA[i]+arrayB[i];
        }
        System.out.println("Tổng của 2 véc tơ là ");
        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }
    
    public void tich(){
        int total=0;
        System.out.println("============");
        for (int i = 0; i < arrayA.length; i++) {
            total+=arrayA[i]*arrayB[i];
        }
        System.out.println("Tích vô hướng của 2 véc tơ là : "+total);
    }

    public mang() {
    }
    
}
