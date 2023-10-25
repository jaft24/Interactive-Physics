/*
 This is a separate class made to track and store a few varables as static and working 
 in all the classes that are connected to the main class
 */
package com.mycompany.interactivephysics;

/**
 *
 * @author jalet
 */
public class ScoreTracker {
    
    // variable declaration begins
    
    /*
       Except for the variable score, the rest are information we obtain from the form.
       The variable store is a static variabke that tracks the questions the user answred correct.
    */
    
    public static double score = 0;
    public static String firstname;
    public static String lastname;
    public static String email;
    public static String phone;
    public static String password;
    
    // variable declaration ends
}
