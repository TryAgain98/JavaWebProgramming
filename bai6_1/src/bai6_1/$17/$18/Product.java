/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_1.$17.$18;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Product {
    private String Name;
    private String Description;//mô tả
    private double Price;//giá
    private int[] rate={1,2,3,4,5};
    public void viewInfo(){
        System.out.println("Tên sản phẩm "+this.Name);
        System.out.println("Giá sản phẩm "+this.Price);
        System.out.println("Mô tả sản phẩm "+this.Description);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }
    public void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tên : ");
        Name=input.nextLine();
        System.out.println("Nêu mô tả : ");
        Description=input.nextLine();
        System.out.println("Nhập giá tiền : ");
        Price=input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
