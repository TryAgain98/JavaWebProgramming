/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_1.$17;

/**
 *
 * @author Pc Of Huy Toan
 */
public class MyCircle {
    private int radius;//bán kính
    private MyPoint myPoint;

    public MyCircle(int radius,int x,int y) {
        this.radius = radius;
        myPoint=new MyPoint(x, y);
    }

    public MyCircle(int radius, MyPoint myPoint) {
        this.radius = radius;
        this.myPoint = myPoint;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getMyPoint() {
        return myPoint;
    }

    public void setMyPoint(MyPoint myPoint) {
        this.myPoint = myPoint;
    }

    @Override
    public String toString() {
        return "Hình tròn @ "+myPoint.toString()+" Bán kính = "+this.radius;//To change body of generated methods, choose Tools | Templates.
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
}
