package Recursion;

public class TailRecursion {
    public static void main(String[] args) {
        tail(5);

    }
    public static void tail(int i){
        if(i<=0){
            return ;
        }

        if(i > 0){

            System.out.println(i +" ");
            tail(i-1);
        }
    }
}
