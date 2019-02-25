/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang2Chieu;

import java.util.Scanner;

/**
 *
 * @author Pc Of Huy Toan
 */
public class mang2Chieu2 {

    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrix3;

    Scanner input = new Scanner(System.in);

    public void nhap() {
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        System.out.println("Nhập matrix1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix1[%d][%d] = ", i, j);
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Nhập matrix2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix2[%d][%d] = ", i, j);
                matrix2[i][j] = input.nextInt();
            }
        }
    }
    public void nhap2() {
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];
        System.out.println("Nhập matrix1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\tmatrix1[%d][%d] = ", i, j);
                matrix1[i][j] = input.nextInt();
            }
        }
    }

    public void prin() {
        System.out.println("matrix1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==============");
        System.out.println("matrix2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t%d", matrix2[i][j]);
            }
            System.out.println("");
        }
    }

    public void total() {
        matrix3 = new int[3][3];
        System.out.println("==============");
        System.out.println("tổng của 2 ma trận là : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf("\t%d", matrix3[i][j]);
            }
            System.out.println("");
        }
    }

    public void tich() {
        matrix3 = new int[3][3];
        System.out.println("==============");
        System.out.println("tích của 2 ma trận là : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.printf("\t%d", matrix3[i][j]);
            }
            System.out.println("");
        }
    }

    public double determinant(int[] a) {
        return a[0] * a[3] - a[1] * a[2];
    }

    public void dinhThuc() {
        System.out.println("===============");
        System.out.println("Định thức của matrix1 là :");
        double total = 0;
        int n = 1;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                int[] a = new int[4];
                int location = -1;
                for (int k = 0; k < matrix1.length; k++) {
                    for (int l = 0; l < matrix1.length; l++) {
                        if (k != i && l != j) {
                            a[++location] = matrix1[k][l];
                        }
                    }
                }
                total = total + Math.pow(-1, 1 + n) * (double) matrix1[i][j] * determinant(a);
                n++;
            }
        }
        System.out.println("============");
        System.out.println(total);
    }

    public void matrixDonVi() {
        System.out.println("====================");
        int checkOne = 0;
        int checkZero = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (i == j) {
                    if (matrix1[i][j] != 1) {
                        checkOne++;
                        break;
                    }
                } else {
                    if (matrix1[i][j] != 0) {
                        checkZero++;
                        break;
                    }
                }
            }
        }
        if (checkOne == 0 && checkZero == 0) {
            System.out.println("Ma trận vừa nhập LÀ ma trận đơn vị");
        } else {
            System.out.println("Ma trận vừa nhập KHÔNG phải ma trận đơn vị");
        }
    }
    public void matrixKhong(){
        int check=0;
        System.out.println("=====================");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < 3; j++) {
                if(matrix1[i][j]!=0){
                    check=1;
                    break;
                }
            }
        }
        if(check==0) System.out.println("matrix1 la ma trận không");
        else System.out.println("matrix1 không phải là ma trận không");
    }
    public void matrixDX(){
        System.out.println("==================");
        int check=0;
        int count=0;
        for (int i = 0; i < 2; i++) {
            for (int j = i+1; j < 3; j++) {
                if(matrix1[i][j]!=matrix1[j][i]){
                    check=1;
                    count++;
                }
            }
        }
        if(check==0){
            System.out.println("matrix1 là ma trận đối xứng");
        }
        else
            System.out.println("matrix1 không phải là ma trận đối xứng");
    }
}
