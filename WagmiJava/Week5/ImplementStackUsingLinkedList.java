package WagmiJava.Week5;
//Implement Stack using Linked List
public class ImplementStackUsingLinkedList {
    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

    }
    public class MyStack{
        Node top = null;
        public void push (int a){
            Node node = new Node(a);
            node.next = top;
            top = node;
        }

        public int pop(){
            if (top == null){
                return -1;
            }
            Node temp = top;
            top = temp.next;
            temp.next = null;
            return temp.value;
        }
    }
}
