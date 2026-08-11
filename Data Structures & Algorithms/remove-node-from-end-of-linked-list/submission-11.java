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
        int k = 0;
        ListNode curr = head;
        while (curr != null){
            k++;
            curr = curr.next;
        }

        if (n == k){
            return head.next;
        }

        ListNode xx = head;
            
        for (int i = 0; i < k - n - 1; i++){
            xx = xx.next;
        }

        xx.next = xx.next.next;
        return head;
    }
}
