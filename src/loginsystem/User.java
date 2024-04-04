/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;
import java.lang.Math;
/**
 *
 * @author tangm
 */
public class User {

    private String username;
    private String password;
    private String email;
    private String lName;
    private String fName;
    private static int aUsers;
    private int id;
    private static final String DELIMITER = "§";
    private String salt = "";

    public User(String u, String p, String e, String l, String f, String s) {
        username = u;
        password = p;
        email = e;
        lName = l;
        fName = f;
        salt = s;
        id = aUsers;
        aUsers++;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @return the aUsers
     */
    public static int getaUsers() {
        return aUsers;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the DELIMITER
     */
    public static String getDELIMITER() {
        return DELIMITER;
    }

    /**
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUsername() {
        return username;
    }
    
    

    public String delimit() {
        String r = id + DELIMITER + username + DELIMITER + password + DELIMITER + email + DELIMITER + lName + DELIMITER + fName + DELIMITER + salt;
        return r;
    }

    public String toString() {
        String r = "Id: " + id
                + "\nUsername: " + username
                + "\nPassword: " + password
                + "\nEmail: " + email
                + "\nLast Name: " + lName
                + "\nFirst Name: " + fName;
        return r;
    }

}
