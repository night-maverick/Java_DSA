package WagmiJava.Week4;
//https://leetcode.com/problems/odd-even-linked-list/description/
public class OddEvenLinkedList {
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode oddEvenList(ListNode head){
            if (head == null){
                return null;
            }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
