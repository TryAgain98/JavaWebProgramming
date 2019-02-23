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
public class Bai5_b {
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
        int integrated=0;
        System.out.println("Tich vo huong cua 2 vec to la : ");
        System.out.print("A.B = ");
        for (int i = 0; i < arrayA.length; i++) {
            integrated=integrated+arrayA[i]*arrayB[i];
        }
        System.out.println(integrated);
    }
}
