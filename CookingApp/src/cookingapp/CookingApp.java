/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookingapp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import gui.Home;
import java.util.Calendar;

/**
 *
 * @author alvarorodriguezjimenez
 */
public class CookingApp {
    
    public static void main(String[] args){
        Home home =new Home();
        home.setVisible(true);
        
      
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        
      
    }
}
