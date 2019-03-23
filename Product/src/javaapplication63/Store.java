/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Store {
    private Product[] products=new Product[20];
    int count=0;
    public void addProduct(){
        int choice;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập 1 để chọn Smartphone, 2 để chọn camera");
        choice=input.nextInt();
        Product p;
        if(choice==1){
            p=new SmartPhone();
        }
        else{
            p=new Camera();
        }
        p.addNew();
        products[count]=p;
        count++;
    }
    public void listProduct(){
        for(int i=0;i<products.length;i++){
            if(products[i]==null) break;
            else{
                System.out.println(products[i].toString());
            }
        }
    }
    public void search(String name){
        for (int i=0;i<products.length;i++) {
            if(products[i]==null) break;
            else if(products[i].getName().equals(name)){
                System.out.println(products[i].toString());
            }
            else System.out.println("Không tìm thấy");
        }
    }
}
