package Stack;

public class Stack_Function  {
    public Node top;
    public int  size ;

    public Stack_Function(){
        top = null;
        size =0;
    }

    public void createStack(int nodevalue){

        top.value = nodevalue ;
        top.next = null;
        size = 1;

    }

    public void push(int nodevalue){
        Node temp = new Node();
        temp.next = top;
        top = temp;
        top.value = nodevalue;
        size++;

    }
    public int pop(){
        int result = top.value;
        top = top.next;
        size--;
        return result;

    }
    public int peek(){
        return top.value;
    }

    public boolean isempty(){
        if(size == 0)
            return true;
        else
            return false;

    }
    public class Node{
        public int  value;
        public Node next;
    }


}


