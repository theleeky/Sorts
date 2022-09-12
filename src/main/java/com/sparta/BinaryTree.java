package com.sparta;

public class BinaryTree {

    Node root;

    public int[] binarySort(int[] arrayToSort){

    }

    private BinaryTree createBinaryTree(int[] arrayToSort) {
        BinaryTree bt = new BinaryTree();
        for (int i = 0; i < arrayToSort.length; i++){
            bt.add(arrayToSort[i]);
        }
    }


    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
}
