package WagmiJava.Week4;
//https://leetcode.com/problems/palindrome-linked-list/description/
public class Palindrome {
    class ListNode{
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

    public boolean isPalindrome(ListNode head){
        ListNode i = head;
        ListNode j = head;
        while (j != null && j.next != null) {
            i = i.next;
            j = j.next.next;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = reverse(i);
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
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
