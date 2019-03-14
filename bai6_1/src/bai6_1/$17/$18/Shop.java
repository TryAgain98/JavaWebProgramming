/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_1.$17.$18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Shop {
    ArrayList ProductList=new ArrayList<>();
    Product p=new Product();
    public void addProduct(){
        p.inputInfo();
        ProductList.add(p.getName());
        ProductList.add(p.getDescription());
        ProductList.add(p.getPrice());
        //System.out.println(ProductList.size());
        System.out.println(ProductList);
    
    }
    public void removeProduct(){
        String name;
        System.out.println("Nhập tên sản phẩm ");
        Scanner input=new Scanner(System.in);
        name=input.nextLine();
        System.out.println("=============");
        for(int i=0;i<ProductList.size();i++){
            if(ProductList.get(i).equals(name)){
                ProductList.remove(i);
            }
        }
       System.out.println(ProductList.size());
        System.out.println(ProductList);
    }
    public void iterrateProductList(){
        System.out.println(ProductList);
        p.viewInfo();
        double total=0;
        int count=0;
        for(int i=2;i<=ProductList.size();i=i+2){
               System.out.println( total=total+ (double)ProductList.get(i));
                count++;
                
            System.out.println("trung bình cộng = "+(total/count));
        }
        System.out.println("a");
        System.out.println("trung bình cộng = "+(total/count));
        int rate;
        for(int i=0;i<=ProductList.size();i=i+4){
            System.out.println("Cho đánh giá : ");
            Scanner input=new Scanner(System.in);
            rate=input.nextInt();
            ProductList.add(rate);  
            
    }
        System.out.println(ProductList.size());
        System.out.println(ProductList);
    }
    
    
}
