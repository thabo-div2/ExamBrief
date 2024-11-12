/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package exambrief;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thabo
 */
public class RepairsTest {
    
    

    /**
     * Test of RepairCosts method, of class Repairs.
     */
    @Test
    public void testRepairCosts() {
        System.out.println("RepairCosts");
        double[] repairCosts = null;
        Repairs instance = new Repairs();
        double expResult = 0.0;
        double result = 0;
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of TechnicianPay method, of class Repairs.
     */
    @Test
    public void testTechnicianPay() {
        System.out.println("TechnicianPay");
        double amount = 0.0;
        Repairs instance = new Repairs();
        double expResult = 0.0;
        double result = instance.TechnicianPay(amount);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of TopTechnician method, of class Repairs.
     */
    @Test
    public void testTopTechnician() {
        System.out.println("TopTechnician");
        double[] repairs = null;
        Repairs instance = new Repairs();
        int expResult = 1;
        int result = instance.TopTechnician(repairs);
        assertEquals(expResult, result);
    }
    
}
