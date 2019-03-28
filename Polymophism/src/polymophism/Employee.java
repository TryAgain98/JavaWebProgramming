/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophism;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class Employee extends Person{//nhan vien
    private double salary;//luong

    public Employee() {
    }

    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public void input(){
        Scanner input=new Scanner(System.in);
        super.input();
        System.out.println("Nhập salary : ");
        salary=input.nextDouble();
    }

    @Override
    public String toString() {
       return super.toString()+"\tsalary : "+salary; //To change body of generated methods, choose Tools | Templates.
    }
    
}
