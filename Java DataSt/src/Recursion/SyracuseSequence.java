package Recursion;

public class SyracuseSequence {
    public static void main(String[] args) {
        int num  = 38;
        syrSeq(num);



    }
    public static void syrSeq(int num){
        if(num == 1){
            System.out.println(" ");
        }
        else if(num%2 == 0){
            int even = num/2;
            System.out.print(even+" , ");
            syrSeq(even);
        }else{
            int odd = (3*num)+1;
            System.out.print(odd+" , ");
            syrSeq(odd);

        }
    }

}
