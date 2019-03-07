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
public class Matrix {

    private int row;
    private int column;
    private int[][] arr0;
    private int[][] arr1;
    private int [][] arr2;

    public Matrix() {
    }

    public Matrix(int row, int column, int[][] arr0, int[][] arr1) {
        this.row = row;
        this.column = column;
        this.arr0 = arr0;
        this.arr1 = arr1;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void inputInfo() {
        System.out.println("Nhập số hàng0 : ");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        System.out.println("Nhập số cột0 : ");
        column = input.nextInt();
        arr0 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("nhập");
                arr0[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Nhập số hàng1 : ");
        row = input.nextInt();
        System.out.println("Nhập số cột1 : ");
        column = input.nextInt();
        arr1 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
    }

    public void showInfo() {
        System.out.println("Ma trận 0 : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf(arr0[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Ma trận 1 : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf(arr1[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public void totalMatrix(){
        arr2=new int[row][column];
        System.out.println("Tổng 2 ma trận là : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j]=arr0[i][j]+arr1[i][j];
                System.out.printf(arr2[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void multiply(){
        arr2=new int[row][column];
        System.out.println("Nhân 2 ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j]=0;
                for (int k = 0; k < column; k++) {
                    arr2[i][j]=arr2[i][j]+arr0[i][k]*arr1[k][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf(arr2[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
