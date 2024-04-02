/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LoginSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
       
     
       //u,p,e,l,f
        RegistrySystem r = new RegistrySystem();
        r.register("bob", "bob123", "bob123@gmail.com", "bob", "joe");
        System.out.println(r.getUser(0));
        r.register("bob", "bob123", "bob123@gmail.com", "bob", "joe");
        r.register("bob1", "bob123", "bob123@gmail.com", "bob", "joe");
        
       
        
      
    }
    
    
    
}
