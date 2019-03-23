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
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Store s=new Store();
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("1. Add product");
           System.out.println("2. List Product");
           System.out.println("3. Search");
           System.out.println("4. Exit");
           System.out.println("Nhập số :");
           choice=input.nextInt();
           switch(choice){
               case 1: s.addProduct();break;
               case 2: s.listProduct();
               case 3: s.search("toan");
           }
        }while (choice!=4); 
    }
    
}
