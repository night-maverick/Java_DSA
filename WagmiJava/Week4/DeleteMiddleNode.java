package WagmiJava.Week4;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class DeleteMiddleNode {
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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null){
            return null;
        }
        ListNode node = new ListNode();
        node.next = head;
        ListNode i = node;
        ListNode j = node;
        while (j.next != null && j.next.next != null) {
            i = i.next;
            j = j.next.next;
        }
        i.next = i.next.next;
        return head;
    }
}
