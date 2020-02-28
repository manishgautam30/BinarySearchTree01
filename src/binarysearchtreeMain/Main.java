package binarysearchtreeMain;

import binarysearchtree.MyBinarySearchTree;
import node.TreeNode;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree bst=new MyBinarySearchTree();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(200);
        bst.insert(250);
        bst.insert(300);
        bst.insert(270);
        bst.insert(180);
        bst.insert(60);
        bst.traversepreOrder(bst.getRoot());
        System.out.println();
        bst.traverseinOrder(bst.getRoot());
        System.out.println();
        bst.traversepostOrder(bst.getRoot());
        System.out.println(bst.search(100));
    }
}
