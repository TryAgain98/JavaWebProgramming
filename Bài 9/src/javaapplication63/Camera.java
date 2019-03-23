/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Camera extends Product{
    private boolean hasWifi;
    @Override
    public void addNew(){
        super.addNew();
        System.out.println("Máy bạn có wifi không có là true ngược lại false");
        Scanner input=new Scanner(System.in);
        hasWifi=input.nextBoolean();
        
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public Camera() {
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    @Override
    public String toString() {
        return super.toString()+"\twifi : "+hasWifi; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
