import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Array List Object Test
 */
public class ArrayListObjTest {
    //Created a instance of the ArrayListObj class at class level
    ArrayListObj testObject = new ArrayListObj();

    /**
     * Write a test that checks if the ArrayListObj class exist and the
     * ability to add to its ArrayList
     */
    @Test
    public void classExists() {
        try {
            Class.forName("ArrayListObj");
        } catch (ClassNotFoundException e) {
            fail("ArrayListObj class does not exist");
        }
    }

    /**
     * Write a test that adds to the ArrayList in the ArrayListObj class
     */
    @Test
    public void addToArrayList() {
        // Create an instance of the ArrayListObj class and assume
        // that an ArrayList exist called myList
        ArrayListObj testObject = new ArrayListObj();
        assertNotNull(testObject.getMyList());

        // Add a element to the ArrayList
        String stringToAdd = "TestElement";
        testObject.getMyList().add(stringToAdd);

        // Check if the element was added
        assertTrue(testObject.getMyList().contains(stringToAdd));
    }

    /**
     * Write a test to check whether or not something
     * has been added to the ArrayList!
     */
    @Test
    public void checkIfAdded() {
        // Create an instance of the ArrayListObj class and assume
        // that an ArrayList exist called myList
        ArrayListObj testObject = new ArrayListObj();
        ArrayList<String> myList = testObject.getMyList();

        // Initial size of the ArrayList
        int initialSize = myList.size();

        // Element to add to ArrayList
        String stringToAdd = "TestElement";

        // Add a element to the ArrayList
        myList.add(stringToAdd);

        // New size of the ArrayList
        int newSize = myList.size();

        //Check if the size increased and new element was added

        assertEquals(initialSize +1, newSize);
        assertTrue(myList.contains(stringToAdd));
    }

    /**
     * Write a test to check whether or not you can retrieve the
     * correct element from a ArrayList using its index!
     */
    @Test
    public void retrieveELementFromArrayList(){
        try{
            String stringToAdd1 = "TestElement1";
            String stringToAdd2 = "TestElement2";
            String stringToAdd3 = "TestElement3";

            // Create an ArrayList and elements
            ArrayList <String> myList = testObject.getMyList();
            myList.add(stringToAdd1);        
            myList.add(stringToAdd2);
            myList.add(stringToAdd3);

            // Retrieve the elements from the ArrayList
            String elementAtIndex0 = myList.get(0);  
            String elementAtIndex1 = myList.get(1);  
            String elementAtIndex2 = myList.get(2);
            
            // Check if the retrieved elements are correct
            assertEquals(stringToAdd1, elementAtIndex0);
            assertEquals(stringToAdd2, elementAtIndex1);
            assertEquals(stringToAdd3, elementAtIndex2);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
        
    }
        /**
         * Write a test to check whether or not you
         * can change an element in the ArrayList
         */
        @Test
        public void canChangeElementInArrayList(){

            try{
                String stringToAdd1 = "TestElement1";
                String stringToAdd2 = "TestElement2";
                String stringToAdd3 = "TestElement3";

                // Create an ArrayList and add elements
                ArrayList <String> myList = testObject.getMyList();
                myList.add(stringToAdd1);        
                myList.add(stringToAdd2);
                myList.add(stringToAdd3);
            
                // Element to modify
                String stringToModify = "ModifiedElement1";
                myList.set(0, stringToModify);

                // Check if the element was modified
                String wasModified = myList.get(0);

                assertEquals(stringToModify, wasModified);
            } catch (Exception e) {
                fail("Exception occurred: " + e.getMessage());
            }   
        }

        /**
         * Write a test to check whether or not you can 
         * remove an element from the ArrayList!
         */
        @Test
        public void canRemoveElement() {
            try{
                String stringToAdd1 = "TestElement1";
                String stringToAdd2 = "TestElement2";
                String stringToAdd3 = "TestElement3";

                // Create an ArrayList and add elements
                ArrayList <String> myList = testObject.getMyList();
                myList.add(stringToAdd1);        
                myList.add(stringToAdd2);
                myList.add(stringToAdd3);

                int initialSize = myList.size();

                // Remove an element from the ArrayList
                String stringToRemove = "TestElement2";
                myList.remove(stringToRemove);

                int newSize = myList.size();

                assertFalse(myList.contains(stringToRemove));
                assertEquals(initialSize -1, newSize);

            } catch (Exception e) {
                fail("Exception occurred: " + e.getMessage());
            }
        }

        /**
         * Write a test to check whether or not you can remove
         *  all elements from the ArrayList!
         */
        @Test
        public void removeAllElements() {
            try{
                String stringToAdd1 = "TestElement1";
                String stringToAdd2 = "TestElement2";
                String stringToAdd3 = "TestElement3";

                // Create an ArrayList and add elements
                ArrayList <String> myList = testObject.getMyList();
                myList.add(stringToAdd1);        
                myList.add(stringToAdd2);
                myList.add(stringToAdd3);
                
                //remove all elements from the ArrayList
                myList.clear();

                // Check if the ArrayList is empty
                assertTrue(myList.isEmpty());
            } catch (Exception e) {
                fail("Exception occurred: " + e.getMessage());
            }
        }
    /**
     * Write a test to check whether or not
     * you can check the size of the ArrayList
     */
    @Test
    public void checkArrayListSize(){
        try{
            String stringToAdd1 = "TestElement1";
            String stringToAdd2 = "TestElement2";
            String stringToAdd3 = "TestElement3";

            // Create an ArrayList and add elements
            ArrayList <String> myList = testObject.getMyList();
            myList.add(stringToAdd1);        
            myList.add(stringToAdd2);
            myList.add(stringToAdd3);

            // Check the size of the ArrayList
            int size = myList.size();
            
            //Check if the size is correct (matches expected)
            assertEquals(3, size);
        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }  
}
