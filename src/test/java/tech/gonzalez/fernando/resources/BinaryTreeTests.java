package tech.gonzalez.fernando.resources;

import org.junit.Test;

import java.lang.reflect.Array;

public class BinaryTreeTests {
    BinaryTree bt = new BinaryTree();
    int[] myArray = new int[] {2, 4, 5, 6, 7, 3, 2};

    @Test
    public void testDeletion(){

    }

    @Test
    public void testAddition(){
        bt.add(6);
    }

    @Test
    public void testCreation(){

    }

    @Test
    public void testArrayConstructor(){
        int[] myArray = new int[] {2, 4, 5, 6, 7, 3, 2};
        BinaryTree btArray = new BinaryTree(myArray);
    }
}




