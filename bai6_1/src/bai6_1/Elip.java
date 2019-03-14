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
public class Elip extends Point{
    private int smallShart;//trục nhỏ
    private int bigShart;//trục lớn

    public Elip(int smallShart, int bigShart) {
        this.smallShart = smallShart;
        this.bigShart = bigShart;
    }
    @Override
    public double acreage(){
        return Math.PI*smallShart*bigShart;
    }

    public Elip() {
    }
}
