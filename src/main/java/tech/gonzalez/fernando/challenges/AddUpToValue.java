package tech.gonzalez.fernando.challenges;

import tech.gonzalez.fernando.resources.BinaryTree;

import java.util.HashMap;

public class AddUpToValue {
    public static void main(String[] args){
        System.out.println("Hello");
    }

    public static boolean addUpToValue(int[] array, int k){

        if(array == null || array.length == 0)
            return false;

        /* Sort Array
        BinaryTree bt = new BinaryTree(array);

        // Traverse BT
        // Check if (index - k) exists on tree if not remove element
        // if so return true;
        // if bt is empty return fa
         * O(nlogn)
         */

        // Linear Solution
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer item : array){
            if(map.containsKey(k-item)){
                return true;
            }
        }
        return false;
    }
}
