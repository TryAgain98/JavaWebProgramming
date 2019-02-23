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
public class Bai1_b {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nNhập array["+i+"]"+" = ");
            array[i]=input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("\narray ["+i+"] = ");
            System.out.print(array[i]+"\n");
        }
        int totalOod=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
            totalOod=totalOod+array[i];
            }
        }
        System.out.println("\ntotal = "+totalOod);
    }
}
