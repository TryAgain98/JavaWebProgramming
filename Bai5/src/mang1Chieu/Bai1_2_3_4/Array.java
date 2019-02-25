/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang1Chieu.Bai1_2_3_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Array {

    Scanner input = new Scanner(System.in);
    private int[] array;

    public Array() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void Nhap() {
        array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhâp a[" + i + "] = ");
            array[i] = input.nextInt();
        }
    }

    public void print() {
        System.out.println("================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void total() {
        int total = 0;
        System.out.println("=================");
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.println("Tổng các phần tử trong mảng là : " + total);
    }

    public void retailTotal() {
        System.out.println("================");
        int retailTotal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                retailTotal += array[i];
            }
        }
        System.out.println("Tổng các phần tử lẻ trong mảng là : " + retailTotal);
    }

    public void evenTotal() {
        System.out.println("================");
        int evenTotal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenTotal += array[i];
            }
        }
        System.out.println("Tổng các phần tử chẵn trong mảng là : " + evenTotal);
    }

    public void maxA() {
        int max = array[0];
        System.out.println("===============");
        for (int i = 0; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println("Phần tử max trong mảng là : " + max);
    }

    public void minA() {
        int min = array[0];
        System.out.println("===============");
        for (int i = 0; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
        }
        System.out.println("Phần tử min trong mảng là : " + min);
    }

    public void Chia() {
        System.out.println("==============");
        System.out.println("Các phần tử chia hết cho 3 là : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public void check() {
        int a;
        int check = 0;
        System.out.println("=======================");
        System.out.println("Nhập a :");
        a = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                check = 1;
            }
        }
        if (check == 1) {
            System.out.println(a + " có xuất hiện trong mảng");
        } else {
            System.out.println(a + " không xuất hiện trong mảng");
        }

    }

    public void random() {
        Random random = new Random();
        array = new int[15];
        System.out.println("===============");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.printf("\t");
        }
        System.out.println("");
    }

    public void bai4() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }
            }
        }
        System.out.println("Sau khi sắp xếp theo thứ tự tăng dần ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }
            }
        }
        System.out.println("Sau khi sắp xếp theo thứ tự giảm dần ");
        System.out.println("=================");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");
        System.out.println("các số chẵn :");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
                System.out.println(array[i]);
            }
        }
        System.out.println("tổng số chẵn trong mảng là : " + count);
        System.out.println("==============");
        System.out.println("Các số lẻ :");
        int countn = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countn++;
                System.out.println(array[i]);
            }
        }
        System.out.println("tổng số lẻ trong mảng là : " + countn);

    }

}
