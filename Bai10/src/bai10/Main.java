/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Toan's PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileUtils f=new FileUtils();
        //f.printFolder("F:\\a");
        //f.printFile("F:\\a");
        f.printFilePicture("C:\\Users\\Toan's PC\\Downloads");
        f.printFilePicture(".txt", "F:\\a");
        f.printTimeFile("F:\\a");
        f.printSizeFile("kb", "F:\\Tai Lieu\\adobe-photoshop-cs6.exe");
    }
    
}
