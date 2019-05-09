/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class Menu {
    private Map<String, String> map;
   private File f1=new File("menu-vi.locale");
   private File f2=new File("menu-en.locale");
    public Menu() {
        try {
            this.map = new HashMap<>();
            f1.createNewFile();
            f2.createNewFile();
            this.loadData("en");
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadData(String lang) {
        try {
            String fileName = "menu-" + lang + ".locale";
            BufferedReader reader
                    = new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(fileName)));
            this.map.clear();
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] split = line.split("=");
                this.map.put(split[0], split[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print() {
        Scanner input = new Scanner(System.in);
        StudentManager sm=new StudentManager();
        while (true) {
            System.out.printf("\n------%s------", this.map.get("menu"));
            System.out.printf("\n1. %s", this.map.get("add"));
            System.out.printf("\n2. %s", this.map.get("search"));
            System.out.printf("\n3. %s", this.map.get("update"));
            System.out.printf("\n4. %s", this.map.get("delete"));
            System.out.printf("\n5. %s", this.map.get("save"));
            System.out.printf("\n6. %s", this.map.get("lang"));
            System.out.printf("\n7. %s", this.map.get("exit"));
            System.out.printf("\n%s", this.map.get("choose"));
            int c = Integer.parseInt(input.nextLine());
            
            switch (c) {
                case 1:
                    sm.add();
                    break;
                case 2:
                    String name;
                    System.out.println("Nhập name cần tìm : ");
                    name=input.nextLine();
                    sm.search(name);
                    break;
                case 3:
                    sm.load();
                    break;
                case 4:
                    String nam;
                    System.out.println("Nhập name cần xóa : ");
                    nam=input.nextLine();
                    sm.delete(nam);
                    break;
                case 5:
                    sm.saveFile();
                    break;
                case 6:
                    System.out.print(this.map.get("mess"));
                    int la = Integer.parseInt(input.nextLine());
                    if (la == 1)
                        this.loadData("en");
                    else if (la == 2)
                        this.loadData("vi");
                    else if (la == 3)
                        this.loadData("jp");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not valid");
            }
        }

    }
}
