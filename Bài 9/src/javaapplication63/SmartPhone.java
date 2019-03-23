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
public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;
    @Override
    public void addNew(){
        super.addNew();
        Scanner input=new Scanner(System.in);
        System.out.println("Máy bạn có camera không có là true ngược lại false");
        hasCamera=input.nextBoolean();
        System.out.println("Nhập số đt : ");
        sim=input.nextInt();
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    @Override
    public String toString() {
        return super.toString()+"\tcamera : "+hasCamera+"\tsim : "+sim; 
    }
    
}
