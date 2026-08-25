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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode tmp1 = list1;
        ListNode tmp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (tmp1 != null && tmp2 != null){
            if (tmp1.val < tmp2.val){
                node.next = tmp1;
                tmp1 = tmp1.next;
            } else {
                node.next = tmp2;
                tmp2 = tmp2.next;
            }
            node = node.next;
        }

        if (tmp1 == null) {
            node.next = tmp2;
        } else {
            node.next = tmp1;
        }

        return dummy.next;

    }
}