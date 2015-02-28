/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Kurt
 */
public class Functions {
    
    public Functions ()
            {
            }
       
    public static int sum(int a,int b)
    {
        return a + b;
    }
     
    public static double minus(double a,double b)
    {//i.floating point test
        return a - b;        
    }
    
    public static boolean truth(String breads)
    {//boolean
               
        String bread = breads;
        
        if(bread.toLowerCase() == "soft")
        {
             return true;
        }
        else
        {
            return false;
        }
    }
    
     public static boolean NotTruth(String breads)
    {//boolean
               
        String bread = breads;
        
        if(bread.toLowerCase() == "hard")
        {
             return false;
        }
        else
        {
            return true;
        }
    }
     
    public static String ObjectA()
    {
        return "yes";
    }
    
     public static String ObjectB()
    {
        return "yes";
    }
          
     
   
       public static int divide(int a,int b)
    {
        return a / b;
    }
       
    public static int multiply(int a,int b)
    {
        return a * b;
    }
    
    public static int subtract(int a,int b)
    {
        return a - b;
    }
    
}
