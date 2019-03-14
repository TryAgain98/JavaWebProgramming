/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_1.$15;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Battery {//pin
    private int energy;//năng lượng

    public Battery() {
        this.energy=10;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void decreaseEnergy(){//năng lượng giảm
        this.energy-=2;
        System.out.println(this.energy);
    }
    
}
