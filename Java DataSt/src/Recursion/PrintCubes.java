package Recursion;

public class PrintCubes {
    public static void main(String[] args) {
        int n = 100;
        cubes(n);
    }
    public static void cubes(int n){
        if(n == 1){
            System.out.print(n);
        }else {
            cubes(n-1);
            System.out.print(" "+n*n*n);
        }
    }
}
