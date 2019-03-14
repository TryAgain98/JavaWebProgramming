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
public class TestMyCircle {

    public static void main(String[] args) {
        MyPoint mp = new MyPoint(3, 4);
        MyCircle m = new MyCircle(5, mp);
        System.out.println(m.toString());    
        System.out.println("diện tích hình tròn = "+m.getArea());
    }
}
