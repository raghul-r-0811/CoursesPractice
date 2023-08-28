package Hashing;

public class Main {
    public static void main(String[] args) {
        DirectChaining dirChain = new DirectChaining(13);
        dirChain.insertHashTable("The");
        dirChain.insertHashTable("quick");
        dirChain.insertHashTable("brown");
        dirChain.insertHashTable("fox");
        dirChain.insertHashTable("over");
        dirChain.searchHashTable("fox");
        dirChain.deleteKeyHashTable("The");
        dirChain.displayHashTable();
        
    }

}
