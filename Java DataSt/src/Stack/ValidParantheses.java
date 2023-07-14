package Stack;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String str = "{[(]}";
        System.out.println(CheckValidParantheses(str));
    }
    public static boolean CheckValidParantheses(String str){
        Stack<Character> stack = new Stack<>();
        char[] chararr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            chararr[i] = str.charAt(i);
        }
        for(char c : chararr){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if(c == ')' && top =='(' || c == '}' && top =='{' || c == ']' && top =='['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
