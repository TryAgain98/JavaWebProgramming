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
public class Bai7_2_c {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập ma trận  :");
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
        
        double total=0;
        int n=1;
        for (int i = 0; i<1;i++ ) {
            for (int j = 0; j < array.length; j++) {
                int[] a=new int[4]; 
                int location=-1;
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        if(k!=i&&l!=j){
                            a[++location]=array[k][l];
                        }
                    }
                    }
                total=total+ Math.pow(-1, 1+n)* (double) array[i][j]*determinant(a);
                        n++;
                }
            }
        System.out.println("============");
        System.out.println(total);
        }
    public static double determinant(int[] a){
        return a[0]*a[3]-a[1]*a[2];
    }
    }

