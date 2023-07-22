package AVL_Tree;

public class Main {

    public static void main(String[] args) {
        AvlTree AVL = new AvlTree();
        AVL.insert(5);
        AVL.insert(10);
        AVL.insert(15);
        AVL.insert(20);

        AVL.levelOrderTraversal( );
    }
}
