package Stack;

import java.util.Stack;

public class NextGreatestInteger {
    public static void main(String[] args) {
        int[] arr = {4, 7,3,4,8,1};
        int[] resultarray  = FindnextGreatest(arr);
        for(int i=0;i<resultarray.length;i++){
            System.out.print(resultarray[i]+" ");
        }
    }
    public static int[] FindnextGreatest(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        for(int i = result.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek() <= arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

}
