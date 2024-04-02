/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author tangm
 */
public class RegistrySystem {
    
    private ArrayList<User> users = new ArrayList<User>();
    private Scanner sc = null;
    private PrintWriter pw;
    
    /**
     * @return the users
     */
    public User getUser(int i) {
        return users.get(i);
    }
    
    //adds an user, makes sure the username isn't already taken and adds it to the arraylist of all users
    public void register(String u, String p, String e, String l, String f){
        if(unique(u)){
        User newU = new User(u,p,e,l,f);
        saveUser(newU);
        users.add(newU);
        } else {
            System.out.println("not unique");
        }
    }
       
    //checks if a username is unique
    //loops through all the names, if the given username is already in use false is returned
    public boolean unique(String u){
        for(int i = 0; i < users.size(); i++){
           if (users.get(i).getUsername().equals(u)){
               return false;
           }
        }
        return true;
    }
    
    public void saveUser(User u){
        try {
            File f = new File("Storage.txt");
            pw = new PrintWriter(new FileWriter(f,true));
            pw.println("hello");
            System.out.println(u.delimit());
            pw.println(u.delimit());
            pw.close();
        } catch (IOException e) {
            System.out.println("broken");
        }
    }
    

}