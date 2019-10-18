package tech.gonzalez.fernando.resources;

public class BinaryTree {
    Node root;

    public BinaryTree(){}

    public BinaryTree(int[] array) {
        for(int value : array){
            this.add(value);
        }
    }

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }

        if(value < current.value){
            current.left = addRecursive(current.left, value);
        } else if(value > current.value){
            current.right = addRecursive(current.right, value);
        } else {
            // Value already present
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    //TODO
    public boolean contains(int value){
        return true;
    }
}

class Node{
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}