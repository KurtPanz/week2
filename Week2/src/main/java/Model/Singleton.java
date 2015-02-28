/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kurt
 */
public class Singleton {
    private static Singleton colour = null;
    
    private Singleton()
    {
    }
    
    public static Singleton getInstance()
    {
    if(colour == null)
    {
        colour = new Singleton();
    }
    return colour;
    }
    
    public static void displayColour()
    {
        System.out.println("Red");
    }
}