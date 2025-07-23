package WagmiJava.Week4;
//https://leetcode.com/problems/linked-list-cycle-ii/description/
public class LinkedListCycle2 {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }
    static ListNode detectCycle(ListNode head){
        ListNode i = head;
        ListNode j = head;
        while (j != null && j.next != null){
            i = i.next;
            j = j.next.next;
            if (i == j){
                break;
            }
        }
        if (j != null || j.next != null){
            return null;
        }
        while (head != i){
            head = head.next;
            i = i.next;
        }
        return head;
    }
}
