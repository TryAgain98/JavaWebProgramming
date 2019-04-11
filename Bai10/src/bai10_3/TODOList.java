/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10_3;

import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class TODOList {

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Task task = new Task();
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("======TODO APP======");
            System.out.println("1. Load tasks");
            System.out.println("2. Show tasks");
            System.out.println("3. Create new task");
            System.out.println("4. filter by Status");
            System.out.println("5. Update Status");
            System.out.println("6. View Detail");
            System.out.println("7. Exit");
            System.out.println("Nhập sự lựa chọn");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    tm.load("F:\\a\\uk.txt");
                    break;
                case 2:
                    tm.showAll();
                    break;
                case 3:
                    tm.add(task);
                    break;
                case 4:
                    System.out.println("chọn trạng thái true hoặc false");
                    boolean done = input.nextBoolean();
                    tm.showDone(done);
                    break;
                case 5:
                    System.out.println("Nhập id : ");
                    int id = input.nextInt();
                    System.out.println("update lại cho nó thành true hoặc false");
                    boolean done1 = input.nextBoolean();
                    tm.updateStatus(id, done1);
                    break;
                case 6:
                    tm.showAll();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại !");
                    break;

            }
        } while (true);
    }

}
