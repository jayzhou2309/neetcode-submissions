/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // counter
        ListNode counter = head;
        int k = 0;
        while(counter != null){
            counter = counter.next;
            k++;
        }

        int target = k - n;
        if(target == 0) return head.next;

        ListNode curr = head;
        ListNode prev = null;
        while (target > 0){
            prev = curr;
            curr = curr.next;
            target--;
        }

        prev.next = curr.next;

        return head;
    }
}
