package Recursion;

public class CheckCharacter {
    public static int i=0;
    public static void main(String[] args) {
        String str = "Raghul";
        char letter = 'b';
        System.out.println(chekchar(letter,str));

        String str1 =" abacada";
        char let1 ='a';
        System.out.println(returncharcount(let1,str1));
    }
    public static boolean chekchar(char letter,String str){
        if(letter == str.charAt(i)){
            return true;
        }
        else if(i == str.length()-1){
            return false;
        }

            i++;
            return chekchar(letter,str);

    }
    public static int returncharcount(char letter , String str){
        if(str.length() ==1)
            return str.charAt(0) == letter?1:0;

        if(str.charAt(str.length()-1) == letter)
            return 1+returncharcount(letter,str.substring(0,str.length()-1));
        else
            return 0+returncharcount(letter,str);
    }
}
