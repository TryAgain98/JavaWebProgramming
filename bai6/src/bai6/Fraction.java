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
public class Fraction {
 private float Numerator;//tử số
 private float denominator;//mẫu số
 private float Numerator1;//tử số
 private float denominator1;
 

    public Fraction() {
    }

    public Fraction(float Numerator, float denominator) {
        this.Numerator = Numerator;
        this.denominator = denominator;
    }

    public float getNumerator() {
        return Numerator;
    }

    public void setNumerator(float Numerator) {
        this.Numerator = Numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }
    public void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tử số : ");
        Numerator=input.nextFloat();
        System.out.println("nhập mẫu số : ");
        denominator=input.nextFloat();
    }
    public void inputInfo1(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tử số 2 : ");
        Numerator1=input.nextFloat();
        System.out.println("nhập mẫu số 2 : ");
        denominator1=input.nextFloat();
    }
    public void showInfo(){
        System.out.println("Phân số là : "+Numerator+"/"+denominator);
    }
    public void compactFraction(){
        for(int i=2;i<=3;){
            if(Numerator%i==0&&denominator%i==0){
                Numerator/=i;
                denominator/=i;
            }
            else i++;
        }
        System.out.println("Sau khi rút gọn phân số mới là : "+Numerator+"/"+denominator);
    }
    public void inverseFraction(){
        System.out.println("nghịch đảo của phân số : "+Numerator+"/"+denominator+" là : "+denominator+"/"+Numerator);
    } 
    public void add(){
        float add;
        add=(Numerator*denominator1+Numerator1*denominator)/(denominator*denominator1);
        System.out.println("Cộng 2 phân số = "+add);
    }
    public void sub(){
        float sub;
        sub=(Numerator*denominator1-Numerator1*denominator)/(denominator*denominator1);
        System.out.println("Trừ 2 phân số = "+sub);
    }
    public void mul(){
        float mul;
        mul=(Numerator*Numerator1)/(denominator*denominator1);
        System.out.println("Nhân 2 phân số = "+mul);
    }
    public void div(){
        float div;
        div=(Numerator*denominator1)/(Numerator1*denominator);
        System.out.println("Chia 2 phân số = "+div);
    }
 
}
