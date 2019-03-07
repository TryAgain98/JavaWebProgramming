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
public class HocBong {

    private String course;//khóa học
    private double point;
    private String rule;//nội quy
    private int soLanThi;
    
    public HocBong() {
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public double getPoint() {
        return point;
    }
    
    public void setPoint(double point) {
        this.point = point;
    }
    
    public String getRule() {
        return rule;
    }
    
    public void setRule(String rule) {
        this.rule = rule;
    }
    
    public int getSoLanThi() {
        return soLanThi;
    }
    
    public void setSoLanThi(int soLanThi) {
        this.soLanThi = soLanThi;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập khóa học cho học viên : ");
        course = input.nextLine();
        System.out.println("nhập điểm cho học viên :");
        point = input.nextInt();
        rule = input.nextLine();
        System.out.println("có vi phạm nội quy không : ");
        rule = input.nextLine();
        System.out.println("Nhập số lần thi của học viên : ");
        soLanThi = input.nextInt();
    }

    public void checkHocBong() {
        if (course.equals("HDSE" )&& getPoint() >= 7.5 && rule.equals("khong") && getSoLanThi() == 1) {
            System.out.println("Học viên được học bổng");
        } else {
            System.out.println("học viên KHÔNG được học bổng");
        }
    }
}
