/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAi4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Bai4_a {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int[] array=new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt();
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int a=array[j];
                    array[j]=array[i];
                    array[i]=a;
                }
            }
        }
        System.out.println("Sau khi sắp xếp theo thứ tự tăng dần ");
        System.out.println("=================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
