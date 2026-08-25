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
        if (head == null) return null;
        ListNode counter = head;
        int k = 0;
        while (counter != null){
            k++;
            counter = counter.next;
        }

        if (n == k){
            return head.next;
        }

        counter = head;

        for (int i = 0; i < k - n - 1; i++){
            counter = counter.next;
        }
        counter.next = counter.next.next;

        return head;
    }
}
