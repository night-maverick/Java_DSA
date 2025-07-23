package WagmiJava.Week4;

import java.util.HashMap;

//https://takeuforward.org/plus/dsa/problems/length-of-loop-in-ll
public class LengthOfLoopInLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {
            val = 0;
            next = null;
        }
        ListNode(int data1) {
            val = data1;
            next = null;
        }
        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }
    //brute force method
    public int findLengthOfLoop(ListNode head){
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        int length = 1;
        while (temp != null) {
            if (map.containsKey(temp)){
                length = length - map.get(temp);
                return length;
            }else{
                map.put(temp, length);
                length++;
                temp = temp.next;
            }
        }
        return 0;
    }
    //optimised approach
    public int findLengthOfLoop1(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        while (j != null && j.next != null) {
            i = i.next;
            j = j.next.next;
            if (i != j){
                int length = 1;
                j = j.next;
                while (j == i) {
                    length++;
                    j = j.next;
                }
                return length;
            }
        }
        return 0;
    }
}
