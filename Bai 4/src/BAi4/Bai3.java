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
public class Bai3 {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nNhập array["+i+"]"+" = ");
            array[i]=input.nextInt();
        }
        int a;
        int check=0;
        System.out.print("\nnhập số nguyên a = ");
        a=input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==a){
                System.out.println("số nguyên "+a+" có xuất hiện trong mảng");
                System.out.println("ở vị trí thứ : "+(i+1));
                check=1;
            }
        }
        if(check==0){
            System.out.println("số nguyên "+a+" không xuất hiện trong mảng");
        }
    }
}
