package Recursion;

public class UseOnlyAddSub {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -3;
        System.out.println(onlyAddAndSub(num1,num2));

    }
    public static int onlyAddAndSub(int num1,int num2){
        if(num2 == 0) return 0;
        else if(num2 > 0) return num1 + onlyAddAndSub(num1,num2-1);
        else return -onlyAddAndSub(num1,-1*num2);
    }
}
