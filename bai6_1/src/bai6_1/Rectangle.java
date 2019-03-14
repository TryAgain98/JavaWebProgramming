/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_1;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Rectangle extends Parallelogram{//hình chữ nhật

    public Rectangle() {
    }

    public Rectangle(int height, int length, int width) {
        super(height, length, width);
    }

    
    @Override
    public double acreage(){//diện tích
        return super.getLength()*super.getWidth();
    }
}
