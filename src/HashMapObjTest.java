import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * HashMap Object Test
 */
 public class HashMapObjTest {

    // Create an instance of the HashMapObj
    HashMapObj testObject = new HashMapObj();

    @Test
    public void classExists(){
        try {
            Class.forName("HashMapObj");
        } catch (ClassNotFoundException e) {
            fail("HashMapObj class does not exist");
        }
    }

    /**
     * Write a test to check whether or not something
     * has been added to the HashMap!
     */
    @Test
    public void checkIfAdded() {

        Map<String, Integer> myMap = testObject.getMyMap();

        // Initial size of the HashMap
        int initialSize = myMap.size();

        // Element to add to HashMap
        String keyToAdd = "TestKey";
        int valueToAdd = 1;

        // Add element to HashMap
        myMap.put(keyToAdd, valueToAdd);

        int newSize = myMap.size();

        //Check if the size increased and new element was added
        assertEquals(initialSize + 1, newSize); 
    }

    /**
     * Test if a specific element has been added
     */
    @Test
    public void addToArrayList() {
        Map<String, Integer> myMap = testObject.getMyMap();

        // Element to add to HashMap
        String keyToAdd = "TestKey";
        int valueToAdd = 1;

        // Add element to HashMap
        myMap.put(keyToAdd, valueToAdd);

        // Check if the element was added
        assertTrue(myMap.containsKey(keyToAdd));
        assertEquals(valueToAdd, myMap.get(keyToAdd).intValue());
    }

    /**
     * Write a test to check whether or not you can 
     * retrieve the correct element from a map using its key!
     */
    @Test
    public void retrieveElement() {
       try{
        Map<String, Integer> myMap = testObject.getMyMap();

        // Elements to add to HashMap
        myMap.put("TestKey1", 1);
        myMap.put("TestKey2", 2);
        myMap.put("TestKey3", 3);

        // Check if the element was added   
        assertEquals(1, myMap.get("TestKey1").intValue());
        assertEquals(2, myMap.get("TestKey2").intValue());
        assertEquals(3, myMap.get("TestKey3").intValue());
       } catch (Exception e) {
           fail("Error: " + e.getMessage());
       }
    }

    /**
     * Write a test to check whether or not you
     * can remove the correct element from a map using its key!
     */
    @Test
    public void removeElementByKey(){
        try{
            Map<String, Integer> myMap = testObject.getMyMap();

            // Elements to add to HashMap
            myMap.put("TestKey1", 1);
            myMap.put("TestKey2", 2);
            myMap.put("TestKey3", 3);

            // Remove the element from the HashMap
            String keyToRemove = "TestKey1";
            myMap.remove(keyToRemove);

            // Check if the element was removed
            assertFalse(myMap.containsKey(keyToRemove));
        
        } catch (Exception e) {
            fail("Error: " + e.getMessage());
        }
    }

    /**
     * Write a test to check whether or not you can remove 
     * all elements from the collection!
     */
    @Test
    public void removeAllElements(){
        try {
           Map<String, Integer> myMap = testObject.getMyMap();

           // Elements to add to HashMap
           myMap.put("TestKey1", 1);
           myMap.put("TestKey2", 2);
           myMap.put("TestKey3", 3);

           // Remove all elements from the HashMap
           myMap.clear();

           // Check if the HashMap is empty
           assertTrue(myMap.isEmpty());       
        } catch (Exception e) {
            fail("Error: " + e.getMessage());
        } 
    }
}
