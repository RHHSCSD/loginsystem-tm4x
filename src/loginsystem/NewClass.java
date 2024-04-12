/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import static loginsystem.Searching.*;

/**
 *
 * @author tangm
 */
public class NewClass {
    public static void main(String[] args){
        
        String x = "azz";
        String y = "za";
        System.out.println(x.compareTo(y));
        System.out.println(binarySearch("hello"));
        System.out.println(seqSearch("hello"));
        System.out.println(binarySearch("computer"));
        System.out.println(seqSearch("computer"));
        remove("computer");
    }
}
