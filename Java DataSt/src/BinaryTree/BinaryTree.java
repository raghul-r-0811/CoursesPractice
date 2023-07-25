package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
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
        newtree.iterativeInOrderTraversal(newtree.root);
        System.out.println("Recursive In-Order Traversal of Binary Tree");
        newtree.recursiveInOrderTraversal(newtree.root);
        System.out.println();
        System.out.println("Recursive Post-Order Traversal of a Binary Tree");
        newtree.recursivePostOrderTraversal(newtree.root);
        System.out.println();
        newtree.iterativePostOrderTraversal(newtree.root);
        newtree.levelOrderTraversal(newtree.root);


    }


    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
    }

    public void recursivePreOrderTraversal(TreeNode root){
        if(root == null  ) return;
        System.out.print(root.data+" ");
        recursivePreOrderTraversal(root.left);
        recursivePreOrderTraversal(root.right);

    }



    public void iterativePreOrderTraversal(TreeNode root){
        System.out.println("Iterative Pre-Order Traversal of Binary Tree");
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

    public void recursiveInOrderTraversal(TreeNode root){
        if(root == null) return;
        recursiveInOrderTraversal(root.left);
        System.out.print(root.data +" " );
        recursiveInOrderTraversal(root.right);
    }

    public void recursivePostOrderTraversal(TreeNode root){
        if(root == null) return;
        recursivePostOrderTraversal(root.left);
        recursivePostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }



    public void iterativePostOrderTraversal(TreeNode root){
        System.out.println("Iterative Post-Order Traversal of Binary Tree");
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()){
                if(current!=null){
                    stack.push(current);
                    current = current.left;
                }else{
                    TreeNode temp = stack.peek().right;
                            if(temp == null){
                                temp = stack.pop();
                                System.out.print(temp.data+" ");
                                     while(!stack.isEmpty() && temp == stack.peek().right){
                                         temp = stack.pop();
                                         System.out.print(temp.data +" ");
                                     }
                            } else{
                                current = temp;
                        }
                }
        }
        System.out.println();
    }

    public void levelOrderTraversal(TreeNode root){
        System.out.println("Level-Order Traversal of binary tree");
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null){
            return;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            System.out.print(temp.data+" ");
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }

        }
        System.out.println();

    }
}
