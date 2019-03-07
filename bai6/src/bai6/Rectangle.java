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
public class Rectangle {
    private int length;//chiều dài
    private int width;//chiều rộng

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhập chiều dài : ");
        length=input.nextInt();
        System.out.println("Nhập chiều rộng : ");
        width=input.nextInt();
    }
    public void acreageRectangle(){//diện tích
        System.out.println("Diện tích hình chữ nhật là : "+length*width);
    }
    public void perimeterRectangle(){
        System.out.println("Chu vi hình chữ nhật là : "+(length+width)*2);
    }
}
