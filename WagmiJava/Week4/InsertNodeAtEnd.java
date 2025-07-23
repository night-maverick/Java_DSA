package WagmiJava.Week4;


public class InsertNodeAtEnd {
    class Node{
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head = null;

    public Node insertAtEnd(Node head, int x){
        Node node = new Node(x);
        if (head == null){
            return node;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        node = temp.next;
        return head;
    }
}
