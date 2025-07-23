package WagmiJava.Week5;

public class ImplementQueueUsingLinkedList {
    public class Node{
        int value;
        Node next;

        public Node (int value){
            this.value = value;
            this.next= null;
        }
    }
    public class MyQueue{
        Node front = null;
        Node rear = null;
        public void push (int a){
            Node node = new Node(a);
            if (front == null && rear == null){
                front = node;
                rear = node;
            }else{
                rear.next = node;
                rear = node;
            }
        }

        public int pop (){
            if (front == null){
                return -1;
            }
            Node temp = front;
            if (temp.next == null){
                front = null;
                rear = null;
                return temp.value;
            }
            front = temp.next;
            front.next = null;
            return temp.value;
        }
    }
}
