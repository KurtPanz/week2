/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;


import Model.Functions;
import Model.Singleton;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kurt
 */
public class FunctionsTest {
    
       
     @Test
    public void testFloatingPoint()
    {//i.floating point test
       
        assertEquals(15.00,Functions.minus(30.00, 15.00),2);
        
    }
    
     @Test
    public void testIntegers()
    {//ii.test integers
    
        assertEquals(15,Functions.sum(5,10));
        //fail("fuck");   
         
    }    
       
    
    @Test
    public void testObjectEquality(double a,double b)
    {//iii.object equality test
      
        
    }
    
    @Test
    public void objectIdentity(double a,double b)
    {//iv.object identity test
     
        
    }
    
    @Test
    public void testTruth()
    {//v.truth test
        boolean truth = false;
        String bread = "soft";
        
        if(bread.toLowerCase() == "soft")
        {
            truth = true;
        }
                
       assertTrue(truth);
       assertTrue(5 < 6);
        
    }
    
    @Test
    public void falseTest()
    {//vi.false test
        boolean truth = true;
        String bread = "hard";
        
        if(bread.toLowerCase() == "hard")
        {
            truth = false;
        }
                
       assertFalse(truth);
       assertFalse(10 < 5);
        
    }
    
    @Test
    public void testNullness()
    {//vii.nullness test               
        Object obj = new Object();
        obj = null;
        
        assertNull(obj);        
        
    }
    
    @Test
    public void testNonNullness()
    {//viii.non-nullness test
        Object obj = new Object();
        obj = Singleton.class;
        
        assertNotNull(obj);  
        
    }
    
    @Test
    public void testFailing()
    {//ix.failling test
        fail("This test method is bound to fail hehehehe");
        
    }
    
    
    public void testTimeout()
    {//x.exceptionsTimeout test
       
        int counter = 120;
        while(counter != 0)
        {
            counter--;
            System.out.println(counter);
        }
    }
    
    @Test
    public void disabling(double a,double b)
    {//xi.disabling test
        
        
    }
    
    @Test
    public void testArraysContent()
    {//xii.arrays content test
        //String[] array = new String[5];
        String[] array = new String[]{"Peter","Danny","Dingo"};
        
        assertArrayEquals(array,new String[]{"Peter","Danny","Dingo"});
        
      
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
}
