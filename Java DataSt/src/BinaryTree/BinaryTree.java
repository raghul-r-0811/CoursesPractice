package BinaryTree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root;
    public static void main(String[] args) {

        BinaryTree newtree = new BinaryTree();
        newtree.createBinaryTree();
        System.out.println("Recursive Pre-Order Traversal of Binary Tree");
        newtree.recursivePreOrderTraversal(newtree.root);
        System.out.println();
        newtree.iterativePreOrderTraversal(newtree.root);
        newtree.iterativeInOrederTraversal(newtree.root);
        System.out.println("Recursive Pre-Order Traversal of Binary Tree");
        newtree.recursiveInOrderTraversal(newtree.root);
        System.out.println();


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
        System.out.println("Recursive Pre-Order Traversal of Binary Tree");
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null) stack.push(temp.right);
            if(temp.left != null) stack.push(temp.left);
        }
        System.out.println();
    }

    public void iterativeInOrderTraversal(TreeNode root){
        System.out.println("Iterative-In-Order Traversal of Binary Tree");
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data +" ");
                temp = temp.right;
            }
        }
        System.out.println();

    }
    public vodi recursiveInOrderTraversal(TreeNode root){
        if(root == null) return;
        recursiveInOrderTraversal(root.left);
        recursiveInOrderTraversal(root.right);
        System.out.print(root.data +" " );
    }

}
