package tech.gonzalez.fernando.challenges;


import tech.gonzalez.fernando.resources.BinaryTree;

public class AddUpToValue {

    public static boolean addUpToValue(int[] array, int k){
        if(array == null || array.length == 0)
            return false;

        // Sort Array
        BinaryTree bt = new BinaryTree(array);

        // Traverse BT
        // Check if (index - k) exists on tree if not remove element
        // if so return true;
        // if bt is empty return false

        return false;
    }
}
