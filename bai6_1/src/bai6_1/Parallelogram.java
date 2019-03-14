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
public class Parallelogram extends Polygon{//hình bình hành
    private int height;

    public Parallelogram() {
    }

    public Parallelogram(int height, int length, int width) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double perimeter(){//chu vi
        return (super.getLength()+super.getWidth())*2;
    }
    @Override
    public double acreage(){//diện tích
        return super.getLength()*height;
    }
}
