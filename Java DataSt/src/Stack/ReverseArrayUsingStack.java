package Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        int[] intarr = {1,2,3,4,5};
        Stack_Function arrStack = new Stack_Function();
        for(int i=0;i<intarr.length;i++){
            int num = intarr[i];
            arrStack.push(num);

        }
        for(int i=0;i<intarr.length;i++){
            intarr[i] = arrStack.pop();

        }
        for(int i=0;i<intarr.length;i++){
            System.out.print(intarr[i]+" ");
        }



    }
}
