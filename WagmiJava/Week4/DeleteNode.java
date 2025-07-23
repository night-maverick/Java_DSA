package WagmiJava.Week4;

public class DeleteNode {
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

    public Node deleteNode(Node head, int x){
        if (x == 1){
            head = head.next;
        }
        Node temp = head;
        for (int i = 1; i < x - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

