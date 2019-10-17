package tech.gonzalez.fernando.challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddUpToValueTests {
    int[] emptyArray = new int[] {};
    int[] nullArray;
    int k = 17;


    @Test
    public void testNull(){
        assertEquals(AddUpToValue.addUpToValue(nullArray, k), false );
    }

    @Test
    public void testEmpty(){
        assertEquals(AddUpToValue.addUpToValue(emptyArray, k), false );
    }
}
