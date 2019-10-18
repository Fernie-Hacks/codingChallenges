package tech.gonzalez.fernando.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddUpToValueTests {
    int[] emptyArray = new int[] {};
    int[] nullArray;
    int[] someArray = new int[] {5,6,10,8,7,1,23,2};
    int k = 17;
    int notThere = 51;
    int there = 33;


    @Test
    public void testNull(){
        assertEquals(AddUpToValue.addUpToValue(nullArray, k), false );
    }

    @Test
    public void testEmpty(){
        assertEquals(AddUpToValue.addUpToValue(emptyArray, k), false );
    }

    @Test
    public void testAddsUp(){
        assertEquals(AddUpToValue.addUpToValue(someArray, k), false );
    }

    @Test
    public void testDoesNotAdd(){
        assertEquals(AddUpToValue.addUpToValue(someArray, notThere), false );
    }

    @Test
    public void testOneMoreThere(){
        assertEquals(AddUpToValue.addUpToValue(someArray, there), false );
    }
}
