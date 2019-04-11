/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class TaskManager {

    private Task[] listTask;
    private static final int max = 20;
    private int count;

    public TaskManager() {
        listTask = new Task[max];
        count = 0;
    }

    public void add(Task task) {
        task.inputInfo();
        listTask[count] = task;
        count++;
        try {
            FileOutputStream fo = new FileOutputStream("F:\\a\\uk.txt", true);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(task);
            oo.flush();
            oo.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(listTask[i]);
        }
    }

    public void showDone(boolean isDone) {
        for (int i = 0; i < count; i++) {
            if (listTask[i].isDone() == isDone) {
                System.out.println(listTask[i]);
            }
        }
    }

    public void load(String path) {
        try {

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Task t=(Task) ois.readObject();
            do {
                System.out.println(t);
                t=(Task) ois.readObject();
            } while (t!=null);
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TaskManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateStatus(int id, boolean done) {
        for (int i = 0; i < count; i++) {
            if (listTask[i].getId() == id) {
                listTask[i].setDone(done);
            }
        }
    }
}
