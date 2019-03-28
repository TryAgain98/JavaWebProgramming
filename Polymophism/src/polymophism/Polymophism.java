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
public class Polymophism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("chọn s sử dụng Student và e ngược lại là Employee  ");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if (c.toUpperCase().equals("S")) {
            instance = new StudentManager();
        } else if (c.toUpperCase().equals("E")) {
            instance = new EmployeeManager();
        } else {
            System.out.println("Not valid");
        }

        if (instance != null) {
            Menu menu = new Menu(instance);
            menu.display();
        }
    }
    
    
}
