/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class ComplexNumber {

    private double realPart;
    private double virtualPart;
    private double realPart1;
    private double virtualPart1;

    public ComplexNumber() {
    }

    public ComplexNumber(double realPart, double virtualPart, double realPart1, double virtualPart1) {
        this.realPart = realPart;
        this.virtualPart = virtualPart;
        this.realPart1 = realPart1;
        this.virtualPart1 = virtualPart1;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phức 1 :");
        System.out.println("Nhập phần thực 1 :");
        realPart = input.nextDouble();
        System.out.println("nhập phần ảo 1 : ");
        virtualPart = input.nextDouble();
        System.out.println("Nhập số phức  2 : ");
        System.out.println("Nhập phần thực 2 :");
        realPart1 = input.nextDouble();
        System.out.println("nhập phần ảo 2 : ");
        virtualPart1 = input.nextDouble();
    }

    public void total() {//tổng
        if (virtualPart + virtualPart1 < 0) {
            System.out.println("Tổng 2 số phức là : " + (realPart + realPart1) + "" + (virtualPart + virtualPart1) + "i");
        } else {
            System.out.println("Tổng 2 số phức là : " + (realPart + realPart1) + " + " + (virtualPart + virtualPart1) + "i");
        }
    }

    public void minus() {//trừ
        if (virtualPart - virtualPart1 < 0) {
            System.out.println("trừ 2 số phức = " + (realPart - realPart1) + " " + (virtualPart - virtualPart1) + "i");
        } else {
            System.out.println("trừ 2 số phức = " + (realPart - realPart1) + " + " + (virtualPart - virtualPart1) + "i");
        }
    }

    public void multiply() {
        double multiplyVirtualPart;//tích của các số ảo
        double multiplyRealPart;//tích của các số thực
        multiplyRealPart = realPart * realPart1 - virtualPart * virtualPart1;
        multiplyVirtualPart = realPart * virtualPart1 + realPart1 * virtualPart;
        if (multiplyVirtualPart < 0) {
            System.out.println("tích 2 số phức = " + multiplyRealPart + " " + multiplyVirtualPart + "i");
        } else {
            System.out.println("tích 2 số phức = " + multiplyRealPart + " + " + multiplyVirtualPart + "i");
        }
    }

    public void share() {
        double shareRealPart;
        double shareVirtualPart;
        shareRealPart = (double) ((realPart * realPart1 + virtualPart * virtualPart1) / (realPart * realPart + virtualPart * virtualPart));
        shareVirtualPart = (double) ((realPart * virtualPart1 - realPart1 * virtualPart) / (realPart * realPart + virtualPart * virtualPart));
        if (shareVirtualPart < 0) {
            System.out.printf("số phức 2 chia số phức 1 = %.3f %.3f", shareRealPart, shareVirtualPart);
        } else {
            System.out.printf("số phức 2 chia số phức 1 = %.3f + %.3fi", shareRealPart, shareVirtualPart);
        }
        System.out.println("");
    }
}
