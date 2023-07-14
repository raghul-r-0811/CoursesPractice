package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10000000;
        String[] strarr = GenerateBinaryNumbers(n);
        for (int i =0;i<n;i++){
            System.out.println(i+1 +" - "+strarr[i]);
        }


    }

    public static String[] GenerateBinaryNumbers(int n){
        Queue<String> q = new LinkedList<>();
        String[] result = new String[n];
        q.offer("1");;
        for(int i=0;i<n ;i++){
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);

        }
        return result;

    }

}
