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
public class Bai2_c {
    public static void main(String[] args) {
        int[] array=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("\nNhập array["+i+"]"+" = ");
            array[i]=input.nextInt();
        }
        System.out.println("Những phần tử chia hết cho 3 : ");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%3==0){
                System.out.println(array[i]);
            }
        }
    }
}
