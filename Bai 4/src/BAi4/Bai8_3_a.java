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
public class Bai8_3_a {
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
        int checkOne=0;
        int checkZero=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i==j){
                    if(array[i][j]!=1){
                        checkOne++;
                        break;
                    }
                }
                else{
                    if(array[i][j]!=0){
                        checkZero++;
                        break;
                    }
                }
            }
        }
        if(checkOne==0&&checkZero==0){
            System.out.println("Ma trận vừa nhập LÀ ma trận đơn vị");
        }
        else{
            System.out.println("Ma trận vừa nhập KHÔNG phải ma trận đơn vị");
        }
    }
}
