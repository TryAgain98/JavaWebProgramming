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
public class bai8_3_c {
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập ma trận 1 :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("\narray[%d][%d] = ",i,j);
                array[i][j]=input.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
        int check=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(array[i][j]!=array[j][i]){
                    check=1;
                    break;
                }
            }
        }
        if(check==0){
            System.out.println("là ma trận đối xứng");
        }
        else System.out.println("không phải là ma trận đối xứng");
    }
}
