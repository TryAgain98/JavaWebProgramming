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
public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập cạnh a :");
        a = input.nextDouble();
        System.out.println("Nhập cạnh b : ");
        b = input.nextDouble();
        System.out.println("Nhập cạnh c : ");
        c = input.nextDouble();
    }

    public void typeTriangle() {//kiểu tam giác

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Đây không phải là tam giác");
        } else if ((a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) && (a != b || a != c || b != c)) {
            System.out.println("Đây là tâm giác vuông");
        } else if ((a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) && (a == b || a == c || b == c)) {
            System.out.println("Đây là tâm giác vuông cân");
        } else if (a == b && a == c) {
            System.out.println("Đây là tam giác đều");
        } else if ((a == b || a == c || b == c) && (a * a + b * b != c * c || a * a + c * c != b * b || b * b + c * c != a * a)) {
            System.out.println("Đây là tam giác cân");
        } else {
            System.out.println("Đây là tam giac thường");
        }
    }

    public void PerimeterTriangle() {//chu vi tam giác
        System.out.println("Chu vi tâm giác là : " + (a + b + c));
    }

    public double AcreageTriangle() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Đây không phải là tam giác");
        } else if ((a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) && (a != b || a != c || b != c)) {
            //System.out.println("Đây là tam giác vuông");
            if(a*a+b*b==c*c) return 0.5*a*b;
            else if(a*a+c*c==b*b) return 0.5*a*c;
            else return 1/2*b*c;
            
        }
        else if ((a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) && (a == b || a == c || b == c)) {
            //System.out.println("Đây là tâm giác vuông cân");
            if(a*a+b*b==c*c) return 0.5*a*b;
            else if(a*a+c*c==b*b) return 0.5*a*c;
            else return 0.5*b*c;
        }
        else if (a == b && a == c) {
            //System.out.println("Đây là tam giác đều");
            return a*a*(Math.sqrt(3)/4);
        }
        else if ((a == b || a == c || b == c) && (a * a + b * b != c * c || a * a + c * c != b * b || b * b + c * c != a * a)) {
            //System.out.println("Đây là tam giác cân");
            if(a==b) return 0.5*a*Math.sqrt(a*a-(c*c)/4);
            else if(a==c) return 0.5*a*Math.sqrt(a*a-(b*b)/4);
            else return 0.5*b*Math.sqrt(b*b-(a*a)/4);
        }
        else {
            double p=a+b+c;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        
        return 0;
    }
}
