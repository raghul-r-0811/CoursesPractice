package BinaryTree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root;
    public static void main(String[] args) {

        BinaryTree newtree = new BinaryTree();
        newtree.createBinaryTree();
        newtree.recursivePreOrderTraversal(newtree.root);
        System.out.println();
        newtree.iterativePreOrderTraversal(newtree.root);


    }


    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void recursivePreOrderTraversal(TreeNode root){
        if(root == null  ) return;
        System.out.print(root.data+" ");
        recursivePreOrderTraversal(root.left);
        recursivePreOrderTraversal(root.right);

    }



    public void iterativePreOrderTraversal(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
    }

    public void interativeInOrederTraversal(TreeNode root){
        if(root != null){


        }
    }


}
