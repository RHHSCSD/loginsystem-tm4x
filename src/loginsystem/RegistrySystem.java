/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tangm
 */
public class RegistrySystem {

    private ArrayList<User> users = new ArrayList<>();
    private Scanner sc;
    private PrintWriter pw;
    private final String DELIMITER = "§";
    private final String FILENAME = "Storage.txt";
    private final String BADPASSWORDS = "BadPasswords.txt";

    //contstructor that starts loads users
    public RegistrySystem() {
        loadUsers();
    }

    /**
     * @param i, user id of user that will be returned
     * @return the users
     */
    public User getUser(int i) {
        return users.get(i);
    }

    //adds an user, makes sure the username isn't already taken and adds it to the arraylist of all users
    public int register(String u, String p, String e, String l, String f) {

        if (!unique(u)) {
            return 1;
        } else if (!noDelimiter(u, p, e, l, f)) {
            return 2;
        } else if (!strongPassword(p)) {
            return 3;
        } else {
            
            String s = generateSalt();
            User newU = new User(u, encrypt(p+s), e, l, f,s);
            saveUser(newU);
            users.add(newU);
            return 0;
        }
    }

    public boolean noDelimiter(String u, String p, String e, String l, String f) {
        String s = u + p + e + l + f;
        return !s.contains(DELIMITER);
    }

    //checks if a username is unique
    //loops through all the names, if the given username is already in use false is returned
    public boolean unique(String u) {
        
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(u)) {
                return false;
            }
        }
        return true;
    }

    public void saveUser(User u) {
        
        try {
            File f = new File(FILENAME);
            pw = new PrintWriter(new FileWriter(f, true));
            pw.println(u.delimit());
            pw.close();
        } catch (IOException e) {
            System.out.println("broken");
        }
    }

    private void loadUsers() {

        try {
            File f = new File(FILENAME);
            sc = new Scanner(f);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                System.out.println(s);
                String[] params = s.split(DELIMITER);
                User newU = new User(params[1], params[2], params[3], params[4], params[5], params[6]);
                users.add(newU);
            }

        } catch (IOException e) {
            System.out.println("broken");
        }
    }

    public boolean strongPassword(String p) {
        
        boolean hasNumber = false;
        boolean hasLetter = false;
        
        try {
            File f = new File(BADPASSWORDS);
            sc = new Scanner(f);
            while (sc.hasNext()) {
                String s = sc.next();
                if (s.equals(p)) {
                    return false;
                }
            }
        } catch (IOException e) {
            System.out.println("broken");
        }

        for (char c : p.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            }
        }
        return (hasNumber && hasLetter);
    }

    public String encrypt(String p) {

        String encryptedPass = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(p.getBytes());
            byte byteData[] = md.digest();
            for (int i = 0; i < byteData.length; ++i) {
                encryptedPass += (Integer.toHexString((byteData[i] & 0xFF) | 0x100).substring(1, 3));
            }

        } catch (NoSuchAlgorithmException ex) {
            System.out.println("no alg");
        }
        return encryptedPass;
    }
    
    
    public String generateSalt(){
       String salt = "";
       char c;
       for(int i = 0; i< 5; i++){
           //21-126
           c =(char) ((char) (Math.random()*(126-21+1))+21);  
           salt += c;
       }
        return salt;
    }
    
    public boolean login(String user, String pass){
        for(User u: users){
            if(u.getUsername().equals(user) && u.getPassword().equals(encrypt(pass+u.getSalt()))){
                return true;
            }
        }
        return false;
    }
}

