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
public class Bai6_1_b {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("\nnhap array[%d][%d] = ",i,j);
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
        System.out.println("======================");
        for (int i = 0; i < array.length; i++) {
            int total=0;
            for (int j = 0; j < array.length; j++) {
                total=total+array[j][i];
            }
            System.out.printf(total+"\t");
        }
    }
}
