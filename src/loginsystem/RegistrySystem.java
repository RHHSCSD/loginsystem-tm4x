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
    
    private ArrayList<User> users = new ArrayList<>();
    private Scanner sc = null;
    private PrintWriter pw;
    private final String DELIMITER = "§";
    private final String FILENAME = "Storage.txt";
    
    //contstructor that starts loads users
    public RegistrySystem(){
        loadUsers();
    }
    /**
     * @param i
     * @return the users
     */
    public User getUser(int i) {
        return users.get(i);
    }
    
    //adds an user, makes sure the username isn't already taken and adds it to the arraylist of all users
    public void register(String u, String p, String e, String l, String f){
        
        if(unique(u) && noDelimiter(u,p,e,l,f)){
        User newU = new User(u,p,e,l,f);
        saveUser(newU);
        users.add(newU);
        } else {
            System.out.println("not unique");
        }
    }
    
       
    public boolean noDelimiter(String u, String p, String e, String l, String f){
        String s = u+p+e+l+f;
        return !s.contains(DELIMITER);
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
            File f = new File(FILENAME);
            pw = new PrintWriter(new FileWriter(f,true));
            pw.println(u.delimit());
            pw.close();
        } catch (IOException e) {
            System.out.println("broken");
        }
    }
    
    public void loadUsers(){
        try{
            File f = new File(FILENAME);
             sc = new Scanner(f);
            while(sc.hasNext()){
                    String s = sc.nextLine();
                String[] params = s.split(DELIMITER);
                User newU = new User(params[1],params[2],params[3],params[4],params[5]);
                users.add(newU);
            }
            
        }catch(IOException e){
            System.out.println("broken");
        }
    }
}
