package WagmiJava.Week4;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class DeleteNthNodeFromEnd {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //brute
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head == null) {
            return null;
        }
        ListNode i = head;
        int size = 0;
        while (i != null) {
            i = i.next;
            size++;
        }
        if (size == n) {
            head = head.next;
            return head;
        }
        ListNode node = head;
        for (int j = 0; j < size - n - 1; j++) {
            node = node.next;
        }
        node.next = node.next.next;
        return head;
    }
    //optimised
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode();
        node.next = head;
        ListNode i = node;
        ListNode j = node;
        for (int k = 0; k < n; k++) {
            j = j.next;
        }
        while (j.next != null) {
            i = i.next;
            j = j.next;
        }
        i.next = i.next.next;
        return node.next;
    }
}
