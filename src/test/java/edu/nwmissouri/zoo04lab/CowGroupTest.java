package edu.nwmissouri.zoo04lab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545223
 */
public class CowGroupTest {
    
    public CowGroupTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class CowGroup.
     */
    @Test
    public void testGroupCreate() {
        System.out.println("create");
        int expResult = 3;
        int result = CowGroup.create();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of run method, of class CowGroup.
     */
    @Test
    public void testGroupRun() {
        //System.out.println("run");
        CowGroup.create();
        CowGroup.run();
         
        // TODO review the generated test code and remove the default call to fail.           
        assertTrue(true);
    }
    
}
