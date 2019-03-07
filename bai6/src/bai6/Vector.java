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
public class Vector {

    private double hoanhDoDau;
    private double tungDoDau;
    private double hoanhDoCuoi;
    private double tungDoCuoi;

    public Vector() {
    }

    public Vector(double hoanhDoDau, double tungDoDau, double hoanhDoCuoi, double tungDoCuoi) {
        this.hoanhDoDau = hoanhDoDau;
        this.tungDoDau = tungDoDau;
        this.hoanhDoCuoi = hoanhDoCuoi;
        this.tungDoCuoi = tungDoCuoi;
    }

    public double getHoanhDoDau() {
        return hoanhDoDau;
    }

    public void setHoanhDoDau(double hoanhDoDau) {
        this.hoanhDoDau = hoanhDoDau;
    }

    public double getTungDoDau() {
        return tungDoDau;
    }

    public void setTungDoDau(double tungDoDau) {
        this.tungDoDau = tungDoDau;
    }

    public double getHoanhDoCuoi() {
        return hoanhDoCuoi;
    }

    public void setHoanhDoCuoi(double hoanhDoCuoi) {
        this.hoanhDoCuoi = hoanhDoCuoi;
    }

    public double getTungDoCuoi() {
        return tungDoCuoi;
    }

    public void setTungDoCuoi(double tungDoCuoi) {
        this.tungDoCuoi = tungDoCuoi;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hoành độ đầu : ");
        hoanhDoDau = input.nextDouble();
        System.out.println("Nhập tung độ đầu : ");
        tungDoDau = input.nextDouble();
        System.out.println("Nhập hoành độ cuối : ");
        hoanhDoCuoi = input.nextDouble();
        System.out.println("Nhập tung độ cuối : ");
        tungDoCuoi = input.nextDouble();
    }

    public void checkEqual() {
        if (getHoanhDoDau() == getHoanhDoCuoi() && getTungDoCuoi() == getTungDoDau()) {
            System.out.println("2 véc tơ bằng nhau");
        }
        else System.out.println(" 2 véc tơ ko bằng nhau");
    }

    public void middleCorner() {//góc giữa
        double result;
        result = (double) ((hoanhDoDau * hoanhDoCuoi + tungDoCuoi * tungDoDau) / (Math.sqrt(hoanhDoDau * hoanhDoDau + tungDoDau * tungDoDau) * Math.sqrt(hoanhDoCuoi * hoanhDoCuoi + tungDoCuoi * tungDoCuoi)));
        System.out.println("result = " + result);
        for (double i = 0; i <= 360; i++) {
            double radian = Math.PI * i / 180;
            if (Math.cos(radian) == result) {
                System.out.println("góc giữa 2 véc tơ bằng = "+i);
                break;
            }
        }
    }
    public void countModule(){
        System.out.println("Module = "+hoanhDoDau * hoanhDoCuoi + tungDoCuoi * tungDoDau);
    }
    public void checkCungPhuong(){
        if((double)(hoanhDoDau/hoanhDoCuoi)==(double)(tungDoDau/tungDoCuoi)){
            System.out.println("2 véc tơ cùng phương");
        }
        else System.out.println("2 véc tơ không cùng phương");
    }
    public void totalVector(){
        System.out.println("Tổng của 2 véc tơ = ( "+(hoanhDoDau+hoanhDoCuoi)+" , "+(tungDoDau+tungDoCuoi)+" )");
    }
    public void Subtraction(){
        System.out.println("hiệu của véc tơ đầu - véc tơ cuối = ( "+(hoanhDoDau-hoanhDoCuoi)+" , "+(tungDoDau-tungDoCuoi)+" )");
    }
    
}
