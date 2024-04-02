/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

/**
 *
 * @author tangm
 */
public class User {
    
    String username;
    String password;
    String email;
    String lName;
    String fName;
    boolean admin;
    static int aUsers;
    int id;
    final static String delimiter = "§";
  
    public User(String u, String p, String e, String l, String f){
        username = u;
        password = p;
        email = e;
        lName = l;
        fName = f;
        admin = false;
        id = aUsers;
        aUsers++;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String delimit(){
        String r = id + delimiter + username + delimiter + password + delimiter + email + delimiter + lName + delimiter + fName;
        return r;
    }
    
    public String toString(){
        String r = "Id: " + id +
                "\nUsername: " + username +
                "\nPassword: " + password +
                "\nEmail: " + email +
                "\nLast Name: " +  lName +
                "\nFirst Name: " + fName;
        return r;
    }
   
}
