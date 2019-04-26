/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Toan's PC
 */
public class CustomerManager {
    private List<Customer> list;

    public CustomerManager() {
        list=new ArrayList<>();
    }
    public void add(){
        Customer c=new Customer();
        c.input();
        list.add(c);
    }
    public boolean save(){
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("cust.dat"));
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return true;
    }
    public boolean load(String file){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
            List<Customer> l=(List<Customer>) ois.readObject();
            list=l;
            for(Customer c:list){
                System.out.println(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
       public Customer search(int id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
