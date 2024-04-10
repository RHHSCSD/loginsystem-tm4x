/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author tangm
 */
public class Searching {

    //change file length and loops as file length changes
    public static int binarySearch(String term) {

        final String aNames = "dictionary.txt";
        Scanner sc;
        int location = -1;
        term = term.toLowerCase();
        int length = 3930;

        try {
            File f = new File(aNames);
            sc = new Scanner(f);
            String[] fileLines = new String[length];
            for (int i = 0; i < length - 1; i++) {
                if (sc.hasNext()) {
                    fileLines[i] = sc.nextLine();
                }
            }

            int low = 0;
            int high = length;
            int mid = 0;
            String s = "";
            int compared = 0;

            //12 is the log_2(3940)
            for (int j = 0; j < 12; j++) {

                mid = (low + high) / 2;
                s = fileLines[mid];
                compared = s.compareTo(term);
                /*
                System.out.print("current term = " + fileLines[mid]);
                System.out.print(" || compared = " + compared);
                System.out.print(" || low = " + low);
                System.out.print(" || mid = " + mid);
                System.out.println(" || high = " + high);
                */
                if (compared == 0) {
                    location = mid + 1;
                    return location;
                } else if (compared > 0) {
                    high = mid + 1;
                } else {
                    low = mid - 1;
                }
            }
        } catch (IOException e) {
            System.out.println("broken");
        }

        return location;
    }

    public static int seqSearch(String term) {
        
        final String aNames = "dictionary.txt";
        Scanner sc;
        int location = -1;
        term = term.toLowerCase();
        int length = 3930;

        try {
            
            File f = new File(aNames);
            sc = new Scanner(f);
            
            for (int i = 0; i < length - 1; i++) {
                if (sc.hasNext()) {
                    if(sc.nextLine().equals(term)){
                        location = i + 1;
                    }
                }
            }
            
        } catch (IOException e) {
            System.out.println("broken");
        }

        return location;
    }

    public static void remove(String term) {

    }
}
