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
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    public void addNew(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập id :");
        id=input.nextInt();
        input.nextLine();
        System.out.println("Nhập name : ");
        name=input.nextLine();
        System.out.println("Nhập price : ");
        price=input.nextDouble();
        System.out.println("Nhập quantity : ");
        quantity=input.nextInt();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "id : "+id+"\tname : "+name+"\tprice : "+price+"\tquantity : "+quantity;
    }

    
    
}
