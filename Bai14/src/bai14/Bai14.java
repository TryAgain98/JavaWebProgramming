/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Toan's PC
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        customManager  m=new customManager();
        m.insert();
    }
}