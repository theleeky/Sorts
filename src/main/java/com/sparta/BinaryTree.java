package com.sparta;

import java.util.ArrayList;

public class BinaryTree {

    Node root;

    public int[] binarySort(int[] arrayToSort){
        Node tree = createBinaryTree(arrayToSort).root;
        // create empty ArrayList
        ArrayList newArray = new ArrayList<>();
        // populate ArrayList
        intArray(tree, newArray);
        // to int[] array
        return newArray.stream().mapToInt(i -> (int) i).toArray();
    }

    private BinaryTree createBinaryTree(int[] arrayToSort) {
        BinaryTree bt = new BinaryTree();
        for (int j : arrayToSort) {
            bt.add(j);
        }
        return bt;
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

    private void add(int value) {
        root = addRecursive(root, value);
    }

    // tranversing through binary tree, adding numbers in order to an ArrayList
    private void intArray(Node node, ArrayList newArray) {
        if (node == null) {
            return;
        }
        intArray(node.left, newArray);
        newArray.add(node.value);
        intArray(node.right, newArray);
    }

}
