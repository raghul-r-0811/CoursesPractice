package Queue;

import java.util.NoSuchElementException;

public class Queue_Function {

    public static void main(String[] args) {
        Queue_Function queue = new Queue_Function();
        queue.Enqueue(10);
        queue.Enqueue(11);
        queue.Enqueue(12);
        queue.Dequeue();

        queue.printqueue();


    }
    public Node front ;
    public Node rear;
    public int size;

    public Queue_Function(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void Enqueue(int nodevalue){
        Node temp = new Node(nodevalue);
        if(isEmpty())
            front = temp;
        else
            rear.next = temp;

        rear = temp;
        size++;
    }

    public void Dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();

        front = front.next;
        if(front == null)
            rear = null;
        size--;
    }

    public void printqueue(){
        if(isEmpty()){
            return;
        }else{
            Node current = front;
            while(current != null){
                System.out.print(current.value +" -->");
                current = current.next;
            }
            System.out.println(" null");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else
            return false;
    }

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }


}

