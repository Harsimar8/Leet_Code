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
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

       
        PriorityQueue<ListNode> qq = new PriorityQueue<>((a, b) -> a.val - b.val);

        
        for (ListNode node : lists) {
            if (node != null) qq.offer(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!qq.isEmpty()) {
            ListNode min = qq.poll();
            tail.next = min;
            tail = tail.next;

            if (min.next != null) qq.offer(min.next);
        }

        return dummy.next;
    }
}
