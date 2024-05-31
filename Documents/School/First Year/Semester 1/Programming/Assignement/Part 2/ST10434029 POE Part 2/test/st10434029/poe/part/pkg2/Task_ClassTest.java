/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10434029.poe.part.pkg2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mac
 */
public class Task_ClassTest {
    Task_Class instance = new Task_Class();








    /**
     * Test of checkTaskDescription method, of class Task_Class.
     */
    @Test
    public void testCheckTaskDescription() {
        String DescriptionLength = "Create Login to authenticate users";
        boolean expected = true;
        boolean actual = instance.checkTaskDescription(DescriptionLength);
        assertEquals(expected, actual);
        
    }

   

    /**
     * Test of returnTotalHours method, of class Task_Class.
     */
    @Test
    public void testAcumulateTotalHours() {
        int expResult = 8;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        
    }
    
    //Test Task ID
    //Test that Task ID is correct provided data
    @Test
    public void TaskID(){
     //Input data from POE   
     String testTaskName = "Add Task Features";
     String testDevFirstName = "Robyn";
     int testTaskNumber = 1; 
     //Test by input of the data
     String expected = "AD:1BYN";
     String actual = instance.createTaskID(testTaskName, testDevFirstName, testTaskNumber);
     assertEquals(expected,actual);
        
    }


    
}
