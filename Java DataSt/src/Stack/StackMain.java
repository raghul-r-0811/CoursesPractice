package Stack;

import java.util.LinkedList;

public class StackMain {
    public static void main(String[] args) {
        Stack_Function firstStack = new Stack_Function();
       
        firstStack.push(2);
        firstStack.push(3);
        firstStack.push(4);
        firstStack.push(5);
        firstStack.pop();
        System.out.println(firstStack.top.value);

    }

}
