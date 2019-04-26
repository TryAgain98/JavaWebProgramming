/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class Customer implements Serializable {

    private int id;
    private String name;
    private String address;
    private int age;

    public Customer(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Customer() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id : " + id + "\ttname : " + name + "\taddress : " + address + "\tage : " + age; //To change body of generated methods, choose Tools | Templates.
    }

    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập id : ");
        id=input.nextInt();
        input.nextLine();
        System.out.println("Nhập name : ");
        name=input.nextLine();
        System.out.println("Nhập address : ");
        address=input.nextLine();
        System.out.println("Nhập age : ");
        age=input.nextInt();
    }
}
