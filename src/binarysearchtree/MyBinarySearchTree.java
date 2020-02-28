package binarysearchtree;

import node.TreeNode;

public class MyBinarySearchTree   {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node= new TreeNode(data);
        if(root==null){
            root=node;
        }
        else{
            TreeNode temp=root;
            TreeNode parent=null;
            while(temp!=null){
                parent=temp;
                if(node.getData() <= temp.getData()){
                    temp=temp.getLeft();

                }else{
                    temp=temp.getRight();
                }
            }
            if(node.getData()<=parent.getData()){
                parent.setLeft(node);

            }else{
                parent.setRight(node);
            }
        }

    }
    public boolean search(int data){
        boolean response=false;
        TreeNode temp= root;
        while(temp!=null){
            if(temp.getData()==data){
                response=true;
                break;
            }else{
                if(data<temp.getData()){
                    temp=temp.getLeft();
                }else{
                    temp=temp.getRight();
                }
            }
        }
        return response;
    }
    public void traversepreOrder(TreeNode node){
        if(node!=null){
            System.out.print(node.getData()+", ");
            traversepreOrder(node.getLeft());
            traversepreOrder(node.getRight());
        }
    }
    public void traverseinOrder(TreeNode node){
        if(node!=null){
            traverseinOrder(node.getLeft());
            System.out.print(node.getData()+", ");
            traverseinOrder(node.getRight());
        }
    }
    public void traversepostOrder(TreeNode node){
        if(node!=null){
            traversepostOrder(node.getLeft());
            traversepostOrder(node.getRight());
            System.out.print(node.getData()+", ");
        }
    }
}
