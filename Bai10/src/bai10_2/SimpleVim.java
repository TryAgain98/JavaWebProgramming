/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Toan's PC
 */
public class SimpleVim {

    private File f;

    public SimpleVim(String path) {
        this.f = new File(path);
    }

    public void writeFile() throws UnsupportedEncodingException {
        
        String content;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập nội dung  :" );
        content=input.nextLine();
        try {
            FileOutputStream fos=new FileOutputStream(f);
            Writer writer = new java.io.OutputStreamWriter(fos, "utf8");
            PrintWriter pw=new PrintWriter(writer);
            pw.write(content);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void checkContentFile(){
        String content;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập nội dung  :" );
        content=input.nextLine();
        try {
            FileOutputStream fos=new FileOutputStream(f);
            PrintWriter pw=new PrintWriter(fos);
            if(content.endsWith(":wq")){
            pw.write(content);
            pw.close();
                System.out.println("đã lưu thành công");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void readFile(){
        try {
            FileInputStream fileInPutStream = new FileInputStream(f);
            Reader reader = new java.io.InputStreamReader(fileInPutStream, "utf8");
            BufferedReader br = new BufferedReader(reader);
            String line=br.readLine();
            do {
            System.out.println(line);    
            line = br.readLine();
        } while (line != null);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimpleVim.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SimpleVim.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
