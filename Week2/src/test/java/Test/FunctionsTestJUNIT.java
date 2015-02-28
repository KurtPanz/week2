/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import Model.Functions;
import Model.Singleton;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
import org.junit.Ignore;
import static org.junit.Assert.*;


/**
 *
 * @author 211150142
 */
public class FunctionsTestJUNIT {
    
    public FunctionsTestJUNIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
       
     @org.testng.annotations.Test
    public void testFloatingPoint()
    {//i.floating point test
       
        assertEquals(15.00,Functions.minus(30.00, 15.00),2);
        
    }
    
     @org.testng.annotations.Test
    public void testIntegers()
    {//ii.test integers
    
        assertEquals(15,Functions.sum(5,10));
        //fail("hi");   
         
    }    
       
    
    @org.testng.annotations.Test
    public void testObjectEquality()
    {//iii.object equality test
        assertEquals(Functions.ObjectA(),Functions.ObjectB());
    }
    
    @org.testng.annotations.Test
    public void objectIdentity()
    {//iv.object identity test
     
        assertTrue(Functions.ObjectA().contains(Functions.ObjectA()));
    }
    
    @org.testng.annotations.Test
    public void testTruth()
    {//v.truth test
//        boolean truth = false;
//        String bread = "soft";
//        
//        if(bread.toLowerCase() == "soft")
//        {
//            truth = true;
//        }
                
       assertTrue(Functions.truth("soft"));
       assertTrue(5 < 6);
        
    }
    
    @org.testng.annotations.Test
    public void falseTest()
    {//vi.false test
//        boolean truth = true;
//        String bread = "hard";
//        
//        if(bread.toLowerCase() == "hard")
//        {
//            truth = false;
//        }
//                
       assertFalse(Functions.NotTruth("hard"));
       assertFalse(10 < 5);
        
    }
    
    @org.testng.annotations.Test
    public void testNullness()
    {//vii.nullness test               
        Object obj = new Object();
        obj = null;
        
        assertNull(obj);        
        
    }
    
    @org.testng.annotations.Test
    public void testNonNullness()
    {//viii.non-nullness test
        Object obj = new Object();
        obj = Singleton.class;
        
        assertNotNull(obj);  
        
    }
    
    @org.testng.annotations.Test
    public void testFailing()
    {//ix.failling test
        fail("This test method is bound to fail hehehehe");
        
    }
    
    @org.testng.annotations.Test(timeOut=100)
    public void testTimeout()
    {//x.exceptionsTimeout test
       
//        int counter = 20000;
//        while(counter != 0)
//        {
//            counter--;
//            System.out.println(counter);
//        }
        while(true);
    }
    
    @org.testng.annotations.Test(enabled = false)
    public void disabling()
    {//xi.disabling test
        
        //Done
    }
    
    @org.testng.annotations.Test
    public void testArraysContent()
    {//xii.arrays content test
        //String[] array = new String[5];
        String[] array = new String[]{"Peter","Danny","Dingo"};
        
        assertArrayEquals(array,new String[]{"Peter","Danny","Dingo"});
        
      
    }
}
