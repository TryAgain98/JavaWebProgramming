/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double money;
    private double totalHour;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double money, double totalHour) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.money = money;
        this.totalHour = totalHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }
    public void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập tên : ");
        name=input.nextLine();
        System.out.println("nhập tuổi : ");
        age=input.nextInt();
        address=input.nextLine();
        System.out.println("nhập địa chỉ : ");
        address=input.nextLine();
        System.out.println("nhập tiền lương  :");
        money=input.nextDouble();
        System.out.println("nhập tổng số giờ làm : ");
        totalHour=input.nextInt();
    }
    public void printInfo(){
        System.out.println("Tên : "+this.name);
        System.out.println("Tuổi : "+age);
        System.out.println("địa chỉ : "+this.address);
        System.out.println("tiền lương : "+this.money);
        System.out.println("tổng giờ làm : "+this.totalHour);
    }
    
    public double tinhThuong(){
        if(getTotalHour()>=200) return money*(0.2);
        else if(getTotalHour()<100) return 0;
        else return money*(0.1);
    }
}
