package Recursion;

public class NonTailRecursion {
    public static String finstr ="";
   public static int num = 0;
    public static void main(String[] args) {
            String str = "abc";
            reverse(str);

    }
    public static void reverse(String str){
        char ch = getChar(str);
        if(ch != '\n'){
            reverse(str);
            System.out.println(ch);
        }
    }
    public static char getChar(String str){
        if(num ==  str.length()){
            return '\n';
        }
        char ch = str.charAt(num);
        num++;
        return ch;
    }
}
