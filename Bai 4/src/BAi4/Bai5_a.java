/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAi4;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Bai5_a {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        int[] arrayB=new int[3];
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap vec to A : ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i]=input.nextInt();
        }
        System.out.println("Nhap vec to B : ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i]=input.nextInt();
        }
        int[] arrayC=new int[3];
        System.out.println("Tong 2 vec to la : ");
        System.out.print("C(");
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i]=arrayA[i]+arrayB[i];
            if(i==arrayA.length-1){
                System.out.print(" "+arrayC[i]+" )\n");
                break;
            }
            System.out.print(" "+arrayC[i]+" ,");
        }
    }
}
