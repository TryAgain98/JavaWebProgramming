package polymophism;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc Of Huy Toan
 */
public class Person {
    private String id;
    private String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập id :");
        id=input.nextLine();
        System.out.println("Nhập name :");
        name=input.nextLine();
    }

    @Override
    public String toString() {
        return "id : "+id+"\tname : "+name;
    }
    
}
