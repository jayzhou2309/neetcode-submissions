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
    public void reorderList(ListNode head) {
        // cut list from mid
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next; // last node
            slow = slow.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        // rotate second list
        ListNode prev = null;
        ListNode curr = second;
        while (curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        second = prev;
        slow = head;

        while (second != null){            
            ListNode tmp1 = slow.next;
            ListNode tmp2 = second.next;

            slow.next = second;
            second.next = tmp1;
            slow = tmp1;
            second = tmp2;
        }
    }
}
