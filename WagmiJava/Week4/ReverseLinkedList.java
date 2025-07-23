package WagmiJava.Week4;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode node = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }
}
