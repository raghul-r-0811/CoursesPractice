package Recursion;

import java.util.Locale;

public class RecursivePalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(checkPlaindromeWord(str));
        String str2 = "Madam,I'm Adam";
        System.out.println(checkPlaindromeWord(str2));


    }
    public static boolean checkPlaindromeWord(String str){
        str = providevalidStr(str);
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        else if(str.charAt(0) != str.charAt(str.length()-1))
        {
            return false;
        }
        else {
            String newStr = subString00(str,1,str.length()-1);
            return checkPlaindromeWord(newStr);
             
        }

    }

    public static String providevalidStr(String str){
        str = str.toLowerCase();
        str = str.replaceAll("\\p{Punct}","");
        str = str.replaceAll("\\s","");
        return str;
    }

    public static String subString00(String str ,int lowindex,int highindex){
        String finstr ="";
        int newStrLength = highindex-lowindex;
        char[] chararr = new char[newStrLength];
        for(int i = 0;i<newStrLength ;i++){
            chararr[i] = str.charAt(i+1);
        }
        for(int i=0;i<chararr.length;i++){
            finstr += chararr[i];
        }
        return finstr;
    }
}
