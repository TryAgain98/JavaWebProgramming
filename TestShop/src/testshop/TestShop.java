/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
class SanPham{
    String Ten;
    String MoTa;
    float GiaBan;
    void XemSanPham(){
        System.out.println("ten san pham la: "+Ten);
        System.out.println("mo ta san pham : "+MoTa);
        System.out.println("gia ban san pham la : "+GiaBan);
    }
}

class Shop{
    ArrayList<SanPham> DanhSachSanPham =new ArrayList<SanPham>();
    Scanner sc=new Scanner(System.in);
    void themSanPham(SanPham sp){
        System.out.println("moi nhap ten san pham");
        sp.Ten=sc.nextLine();
        System.out.println("moi nhap mo ta san pham");
        sp.MoTa=sc.nextLine();
        System.out.println("moi nhap gia san pham");
        sp.GiaBan=sc.nextFloat();
        DanhSachSanPham.add(sp);
    }
}

public class TestShop {

    static void Menu(){
        System.out.println("======================");
        System.out.println("he thong quan ly san pham");
        System.out.println("1.them san pham");
        System.out.println("2.xem san pham");
        System.out.println("3.tim san pham");
        System.out.println("4.xoa san pham");
        System.out.println("5.thoat");
        System.out.println("=======================");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luachon;
        Shop shop=new Shop();
        Scanner sc=new Scanner(System.in);
        Menu();
        while(true){
            System.out.println("moi ban chon muc");
            luachon=sc.nextInt();
            switch(luachon){
                case 1:
                    shop.themSanPham(new SanPham());
                    break;
                default :
                    luachon=5;
                    break;
                    
            }
        }
        // TODO code application logic here
    }
    
}
