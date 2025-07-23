package WagmiJava.Week4;
//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        ListNode i = head;
        ListNode j = head;
        while (j != null && j.next != null){
            i = i.next;
            j = j.next.next;
            if (i == j){
                return true;
            }
        }
        return false;
    }
}
