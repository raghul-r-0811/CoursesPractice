package Recursion;

public class GCD_Recursion {
    public static void main(String[] args) {
        System.out.println(gcd(7,11));
    }
    public static int gcd(int n,int m){
        if(m <= n && n % m == 0){
            return m;
        }else if(n<m){
            return gcd(m,n);
        }else{
            return gcd(m,n % m);
        }
    }
}
