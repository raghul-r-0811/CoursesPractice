package BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap newBH = new BinaryHeap(5);

        newBH.insert(10,"Min");
        newBH.insert(5,"Min");
        newBH.insert(15,"Min");
        newBH.insert(1,"Min");
        newBH.insert(6,"Min");
        newBH.levelorder();
        newBH.extractHeapofBH("Min");
        newBH.levelorder();
    }
}
