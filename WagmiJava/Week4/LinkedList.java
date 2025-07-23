package WagmiJava.Week4;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(4);
        list.addAtHead(8);
        list.addAtHead(9);
        list.addAtTail(5);
        list.addAtIndex(1, 3);
        list.addAtIndex(2, 17);
        System.out.println(list.get(5));
        list.display();
        System.out.println();
        list.deleteAtIndex(0);
        list.display();
    }
}
