/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2Chieu;

/**
 *
 * @author Pc Of Huy Toan
 */
public class matrix {
    public static void main(String[] args) {
        mang2Chieu1 m1=new mang2Chieu1();
        m1.nhap();
        m1.print();
        m1.totalCow();
        m1.totalClo();
        System.out.println("================");
        mang2Chieu2 m2=new mang2Chieu2();
        m2.nhap();
        m2.prin();
        m2.total();
        m2.tich();
        m2.dinhThuc();
        System.out.println("====================");
        m2.nhap2();
        m2.matrixDonVi();
        m2.matrixKhong();
        m2.matrixDX();
    }
}
