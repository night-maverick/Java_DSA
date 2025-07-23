package WagmiJava.Week4;

public class MyLinkedList {
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public MyLinkedList(int size) {
        this.size = 0;
    }

    public MyLinkedList(){

    }

    public int get(int index) {
        Node node = head;
        if (index >= size || head == null){
            return -1;
        }
        for (int i = 0; i < index - 1; i++) {
            if (node == null){
                return -1;
            }
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null){
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        if (index == 0){
            addAtHead(val);
            return;
        }
        if (index > size){
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size){
            return;
        }
        if (index == 0){
            head = head.next;
            size--;
            if (head == null){
                tail = null;
            }
            return;
        }
        Node temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
