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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevE = dummy;

        while (true) {
            ListNode kth = getN(prevE, k);
            if (kth == null) break;

            ListNode groupStart = prevE.next;
            ListNode nextGroupStart = kth.next;

            ListNode prev = kth.next;
            ListNode cur = groupStart;

            while (cur != nextGroupStart) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
            prevE.next = kth;
            prevE = groupStart;
        }

        return dummy.next;
    }
    private ListNode getN(ListNode cur, int k) {
        while (cur != null && k > 0) {
            cur = cur.next;
            k--;
        }
        return cur;
    }
}
