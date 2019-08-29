
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toan
 */
public class NewClass {
    public static void main(String[] args) {
        double kilobytes = 1205.6358;
 
	System.out.println("kilobytes : " + kilobytes);
 
	double newKB = Math.round(kilobytes*100.0)/10.0;
	System.out.println("kilobytes (Math.round) : " + newKB);
 
	DecimalFormat df = new DecimalFormat(".#####");
	System.out.println("kilobytes (DecimalFormat) : " + df.format(kilobytes));
        float a=Float.parseFloat(df.format(kilobytes));
        System.out.println(a+5);
    }
}
