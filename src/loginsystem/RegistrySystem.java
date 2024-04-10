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

    //contstructor that loads users
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
    /**
     * @param u,p,e,l,f, username, password, email, last name, first name
     * @return 0 for success
     *         1 if the username isn't unique
     *         2 if the user's fields includes the delimiter
     *         3 if the password is not strong
     */
    public int register(String u, String p, String e, String l, String f) {
        
        //check if the username is unique, doesn't contain the delimiter. and has a strong password
        if (!unique(u)) {
            return 1;
        } else if (!noDelimiter(u, p, e, l, f)) {
            return 2;
        } else if (!strongPassword(p)) {
            return 3;
        } else {
            
            //generates salt and makes a new user and adds it the the array of all users
            String s = generateSalt();
            User newU = new User(u, encrypt(p + s), e, l, f, s);
            saveUser(newU);
            users.add(newU);
            return 0;
        }
    }

    /**
     * @param u,p,e,l,f, user id of user that will be returned
     * @return the users
     */
    public boolean noDelimiter(String u, String p, String e, String l, String f) {
        String s = u + p + e + l + f;
        return !s.contains(DELIMITER);
    }

    /**
     * @param u,username
     * @return true if the username is unique
     *         false if the username is taken
     */
    public boolean unique(String u) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(u)) {
                return false;
            }
        }
        return true;
    }
    /**
     * @param u, user
     *          converts user data to delimited text and saves to file 
     */
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

    /**
     * loads users from file to the class
     */
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

    /**
     * @param p, password
     * @return true if password has a letter and a number 
     */
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

    /**
     * @param p, password
     * @return string of encrypted password 
     */
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
    
    /**
     * @return string of 5 random characters
     */
    public String generateSalt() {
        String salt = "";
        char c;
        for (int i = 0; i < 5; i++) {
            //21-126
            c = (char) ((char) (Math.random() * (126 - 21 + 1)) + 21);
            salt += c;
        }
        return salt;
    }

    /**
     * @param user,pass, username and password
     * @return true if password matches username
     *         false if it doesn't
     * 
     */
    public boolean login(String user, String pass) {
        for (User u : users) {
            if (u.getUsername().equals(user) && u.getPassword().equals(encrypt(pass + u.getSalt()))) {
                return true;
            }
        }
        return false;
    }
}
