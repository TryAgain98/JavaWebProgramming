/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10_3;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class Task implements Serializable{

    private int id;
    private String title;
    private String content;
    private boolean done;

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Task(int id, String title, String content, boolean done) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.done = done;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id : ");
        id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập title :");
        title = input.nextLine();
        System.out.println("Nhập content : ");
        content = input.nextLine();
        System.out.println("Nhập 1 nếu làm bài tập ngược lại nhập 0");
        int con;
        con = input.nextInt();
        if (con == 1) {
            done = true;
        } else {
            done = false;
        }
    }

    @Override
    public String toString() {
        return "id : "+id+"\ttitle : "+title+"\tcontent : "+content+"\tdone : "+done; //To change body of generated methods, choose Tools | Templates.
    }
    
}
