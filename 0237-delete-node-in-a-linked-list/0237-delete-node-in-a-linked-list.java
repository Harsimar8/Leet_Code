/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node.next;
        ListNode cur1 = node.next.next;
        int y = cur.val;
        node.val = y;
        node.next = cur1;
    }
}