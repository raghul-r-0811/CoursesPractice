package Recursion;

public class PutCommas {
    static  String str ="";
    public static void main(String[] args) {
        System.out.println( putcommasbw(1234567980));
    }

    public static String putcommasbw(int num){

        if(num / 1000 == 0){
            str +=Integer.toString(num);
            return str;
        }
        int mod = num % 1000;
        putcommasbw(num/1000);
        str += "," + Integer.toString(mod);
        return str;
    }
}
