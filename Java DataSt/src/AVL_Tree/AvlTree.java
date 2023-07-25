package AVL_Tree;

import BinaryTree.TreeNode;


import java.util.LinkedList;
import java.util.Queue;

public class AvlTree {
    BinaryNode root;

    public AvlTree() {
        root = null;
    }


    public void levelOrderTraversal(){
        System.out.println("Level-Order Traversal of binary tree");
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        if(root == null){
            return;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryNode temp = queue.remove();
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
    public void preorderTraversal(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public BinaryNode search(BinaryNode node, int value){
        if(node == null){
            System.out.println("given value not found in AVL tree");
            return null;
        }else if(node.data == value){
            System.out.println("value found");
            return node;
        }
        else if(node.data < value){
            return search(node.left,value);
        }
        else{
            return search(node.right,value);
        }
    }

    public int getHeight(BinaryNode node){
        if(node == null){   return 0;   }
        return node.height;
    }

    public BinaryNode rightRotation(BinaryNode node){
        BinaryNode newnode = node.left;
        node.left = node.left.right;
        newnode.right = node;
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        newnode.height = 1+ Math.max(getHeight(newnode.left),getHeight(newnode.right));
        return newnode;
    }

    public BinaryNode leftRotation(BinaryNode node){
        BinaryNode newNode = node.right;
        node.right = node.right.left;
        newNode.left = node;
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        newNode.height = 1 + Math.max(getHeight(newNode.left),getHeight(newNode.right));
        return newNode;

    }

    public int getBalance(BinaryNode node){
        if(node == null){   return 0; }
        return getHeight(node.left) - getHeight(node.right);
    }

    private BinaryNode insertNode(BinaryNode node,int nodeValue){
        if(node == null){
            BinaryNode newNode = new BinaryNode();
            newNode.data = nodeValue;
            newNode.height = 1;
            return  newNode;
        } else if(nodeValue < node.data){
            node.left = insertNode(node.left,nodeValue);
        }else {
            node.right = insertNode(node.right,nodeValue);
        }


        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));

        int balance  = getBalance(node);

        if(balance >1 && nodeValue < node.left.data ){
            return rightRotation(node);
        }
        if(balance >1 && nodeValue > node.left.data){
            node.left =  leftRotation(node);
            rightRotation(node);
        }
        if(balance < -1 && nodeValue > node.right.data){
            return leftRotation(node);
        }
        if(balance < -1 && nodeValue < node.right.data){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        return node;
    }

    public void insert(int value){
        root = insertNode(root,value);
    }

    public static BinaryNode minimumNode(BinaryNode root){
        if(root.left == null){
            return root;
        }
        return minimumNode(root.left);
    }

    public BinaryNode deleteNode(BinaryNode node,int value){
        if(node == null){
            System.out.println("node not found in avl tree");
            return null;
        }
         if(value > node.data){
            node.right = deleteNode(node.right,value);
        } else if (value < node.data) {
             node.left = deleteNode(node.right,value);
         }else{
             if(node.left != null && node.right != null){
                 BinaryNode temp = node;
                 BinaryNode minNodeRight =minimumNode(temp.right);
                 node.data = minNodeRight.data;
                 node.right = deleteNode(node.right, minNodeRight.data);
             } else if (node.left!= null) {
                 node = node.left;
             } else if (node.right != null) {
                 node=node.right;
             }else{
                 node = null;
             }
             int balance = getBalance(node);
             if(balance > 1 && getBalance(node.left)>=0){
                 return rightRotation(node);
             }
             if(balance > 1 && getBalance(node.left)<0){
                 node.left = leftRotation(node.left);
                 return rightRotation(node);
             }
             if(balance <-1 && getBalance(node.right)<=0){
                 return leftRotation(node);
             }
             if(balance <-1 && getBalance(node.right)>0){
                 node.right = rightRotation(node.right);
                 return leftRotation(node);
             }

         }

        return node;
    }

    public void delete(int value){
        root = deleteNode(root,value);
    }
}
