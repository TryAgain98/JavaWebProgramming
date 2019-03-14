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
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")"; //To change body of generated methods, choose Tools | Templates.
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }
    public double distance(MyPoint point1){
        return Math.sqrt((this.x-point1.x)*(this.x-point1.x)+(this.y-point1.y)*(this.y-point1.y));
    }
}
