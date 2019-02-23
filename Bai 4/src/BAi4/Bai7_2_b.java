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
public class Bai7_2_b {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        int[][] arrayB=new int[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập ma trận 1 :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("\narray[%d][%d] = ",i,j);
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("Nhập ma trận 2 :");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                System.out.printf("\narray[%d][%d] = ",i,j);
                arrayB[i][j]=input.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < arrayB.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                System.out.print(arrayB[i][j]+"\t");
            }
            System.out.println("");
        }
        int[][] arrayC=new int[3][3];
        System.out.println("Tích của 2 ma trận là : ");
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC.length; j++) {
                int total=0;
                for (int k = 0; k < arrayC.length; k++) {
                    total=total+array[i][k]*arrayB[k][j];
                }
                System.out.printf(total+"\t");
            }
            System.out.println();
        }
    }
}
