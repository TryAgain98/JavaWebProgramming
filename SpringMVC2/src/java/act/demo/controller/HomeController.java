/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.demo.controller;

import act.demo.DB.Connector;
import act.demo.dto.Customer;
import act.demo.dto.Products;
import act.demo.model.ProductManager;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Toan
 */
@Controller
public class HomeController {
     ProductManager pm=new ProductManager();
     @RequestMapping("/")
    public String show(Model model){
       
        try {
          
            List<Products> l=pm.show();
            model.addAttribute("l", l);
           
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "index";
    }
    @RequestMapping("/search")
    public String search(@RequestParam("search") String name,Model model){
        
byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);
name = new String(bytes, StandardCharsets.UTF_8);
        try {
          
            List<Products> l=pm.search(name);
            model.addAttribute("l", l);
           
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "index";
    }

     @RequestMapping("/Registration")
    public String HomeController(Model model) {
        List<Integer> LDay=new ArrayList<>();
        List<Integer> LMonth=new ArrayList<>();
        List<Integer> Lyear=new ArrayList<>();
         Customer c=new Customer();
         
        for(int i=1;i<=31;i++){
            LDay.add(i);
            if(i<13){
                LMonth.add(i);
            }
        }
        long millis=System.currentTimeMillis();  
java.sql.Date date=new java.sql.Date(millis); 
SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        for(int i=Integer.parseInt(formatter.format(date));i>=1900;i--){
            Lyear.add(i);
        }
        model.addAttribute("c", c);
        model.addAttribute("lday", LDay);
        model.addAttribute("lmonth", LMonth);
        model.addAttribute("lyear", Lyear);
        return "Registration";
    }
     
     @RequestMapping("/addAccount")
    public String addAccount(@ModelAttribute Customer c,Model model){
         try {
             
             pm.insertCustomer(c);
         } catch (SQLException ex) {
             Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
         }
        return "index";
    }
}
