

/*
 This is the main class of the whole project and the program runs and starts from thus class.
 */


package com.mycompany.interactivephysics;

/**
 *
 * @author jalet
 */
public class InteractivePhysicsTester {
    public static String student = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
       /* User Registration Page */
       
       /* The user registration is the first page of the program so the rest
        of the pages are commented and the first one is set visible. */ 
       
       UserRegistration ur = new UserRegistration();
       ur.setVisible(true); 
       
     
       
       
     /*  
       Set Start Page
       StartPage sp = new StartPage();
       sp.setVisible(true);
     */
      
   
      /*
        Question 1
        MagnetQuestion mq = new MagnetQuestion();
        mq.setVisible(true);
       */ 
      
      
       /*
         Question 2
         FrictionalForceQuestion ffq = new FrictionalForceQuestion();
         ffq.setVisible(true);
      */      
         
       
       /*
         Question 3
         ProjectileMotion pm = new ProjectileMotion();
         pm.setVisible(true);
       */  
       
       
        /*
         Score Summary Page
         ScoreSummary ss = new ScoreSummary()
         ss.setVisible(true);
       */
         
         
         

         
    }
    
}
