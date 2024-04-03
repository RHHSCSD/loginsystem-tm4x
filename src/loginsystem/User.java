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

    String username;
    String password;
    String email;
    String lName;
    String fName;
    static int aUsers;
    int id;
    final static String DELIMITER = "§";
    String salt;

    public User(String u, String p, String e, String l, String f) {
        username = u;
        password = p;
        email = e;
        lName = l;
        fName = f;
        id = aUsers;
        aUsers++;
        salt = generateSalt();
    }

    public String getUsername() {
        return username;
    }

    public String delimit() {
        String r = id + DELIMITER + username + DELIMITER + password + DELIMITER + email + DELIMITER + lName + DELIMITER + fName;
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

    public String generateSalt(){
       String salt = "";
       char c;
       for(int i = 0; i< 5; i++){
           //21-126
           c = Math.random()
       }
       return salt;
    }
}
