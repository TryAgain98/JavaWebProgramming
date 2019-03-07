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
public class Student {
    private String codeStudent;
    private double point;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(String codeStudent, double point, int age, String lop) {
        this.codeStudent = codeStudent;
        this.point = point;
        this.age = age;
        this.lop = lop;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfo(){
        Scanner input=new Scanner(System.in);
        System.out.println("nhập mã sinh viên : ");
        codeStudent=input.nextLine();
        System.out.println("nhập điểm trung bình : ");
        point=input.nextDouble();
        System.out.println("nhập tuổi : ");
        age=input.nextInt();
        lop=input.nextLine();
        System.out.println("nhập lớp : ");
        lop=input.nextLine();
        
    }
    public void showInfo(){
        System.out.println("mã sinh viên là : "+getCodeStudent());
        System.out.println("điểm : "+getPoint());
        System.out.println("tuổi : "+getAge());
        System.out.println("lớp : "+getLop());
    }
    public void scholarship(){
        if(getPoint()>8) System.out.println("sinh viên được học bổng");
        else System.out.println("Sinh viên không được học bổng ");
    }
}
