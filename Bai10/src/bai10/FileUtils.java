/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author Toan's PC
 */
public class FileUtils {

    private File f;

    public void printFolder(String path) {
        f = new File(path);
        int check = 0;
        for (File f1 : f.listFiles()) {
            if (!f1.isFile()) {
                System.out.println(f1.getName());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("danh sach nay khong co folder");
        }
    }

    public void printFile(String path) {
        f = new File(path);
        int check = 0;
        for (File f1 : f.listFiles()) {
            if (f1.isFile()) {
                System.out.println(f1.getName());
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("danh sach nay khong co file");
        }
    }

    public void printFilePicture(String path) {
        f = new File(path);
        int check=0;
        for (File f1 : f.listFiles()) {
            if(f1.getName().endsWith(".png")||f1.getName().endsWith(".jpg")||f1.getName().endsWith(".jpeg")){
                System.out.println(f1.getName());
                check=1;
            }
        }
        if(check==0){
            System.out.println("khong co file nay trong folder");
        }
    }
    public void printFilePicture(String ext,String path) {
        f = new File(path);
        int check=0;
        for (File f1 : f.listFiles()) {
            if(f1.getName().endsWith(ext)){
                System.out.println(f1.getName());
                check=1;
            }
        }
        if(check==0){
            System.out.println("khong co file nay trong folder");
        }
    }
    public void printTimeFile(String path) {
        f = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Thời gian cập nhật của file : " + sdf.format(f.lastModified()));

    }

    public void printSizeFile(String type,String path) {
         f = new File(path);
        double kb = (double)(f.length() / 1024);
        double mb = (double)(kb / 1024);
        if (type.equals("kb")) {
            System.out.println("size file = " + kb + " kb");
        } else if (type.equals("mb")) {
            System.out.println("size file = " + mb + " mb");
        } else {
            System.out.println("Sai type");
        }
    }
}
