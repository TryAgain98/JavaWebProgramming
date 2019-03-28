/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymophism;

/**
 *
 * @author Pc Of Huy Toan
 */
public abstract class Manager {//giám đốc
    protected Person[] arr = null;
    protected int count = 0;
    
    public abstract void add();
    public abstract void search(String name);
    public abstract void show();
}
