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
public class Bai4_d {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int[] array=new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt();
            System.out.println(array[i]);
        }
        System.out.println("==============");
        System.out.println("Các số lẻ :");
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                count++;
                System.out.println(array[i]);
            }
        }
        System.out.println("tổng số lẻ trong mảng là : "+count);
        
    }
    
}
