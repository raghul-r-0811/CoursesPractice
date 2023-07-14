package Recursion;

public class RecursionExercises {
    public static void main(String[] args) {
        printOddNum(9);

        System.out.println("--------------");

        rec(9);
    }
    public static int printOddNum(int n){
        if (n%2 == 0) n--;
        if(n == 1) {
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return printOddNum(n-2);
    }
    public static int rec(int n){
        System.out.println(n);
        if(n==1){
            return n;
        }
        return rec(n-2);
    }

}
