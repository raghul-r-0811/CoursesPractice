package BinaryTree;

public class BinaryTreeProblems {


    private TreeNode root;
    public static void main(String[] args) {
            BinaryTreeProblems problemTree = new BinaryTreeProblems();
            problemTree.createProblemTree();
            BinaryTree bt = new BinaryTree();
            bt.levelOrderTraversal(problemTree.root);
            int largestInBiTree = problemTree.biggestInBinaryTree(problemTree.root);
            System.out.println("the largest value in the binary tree is "+largestInBiTree);
    }

    public void createProblemTree(){
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(25);
        TreeNode node5 = new  TreeNode(9);
        TreeNode node6 = new TreeNode(23);
        root = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

    }

    public int biggestInBinaryTree(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = biggestInBinaryTree(root.left);
        int right = biggestInBinaryTree(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }
}
