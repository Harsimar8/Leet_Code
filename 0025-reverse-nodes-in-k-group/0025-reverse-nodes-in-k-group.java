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
        ListNode prevGroup = dummy;

        while (true) {
            // 1️⃣ Find kth node
            ListNode kth = prevGroup;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break; // not enough nodes

            // 2️⃣ Mark next group start
            ListNode nextGroup = kth.next;
            kth.next = null;

            // 3️⃣ Reverse current group
            ListNode groupStart = prevGroup.next;
            ListNode newHead = reverse(groupStart);

            // 4️⃣ Connect
            prevGroup.next = newHead;
            groupStart.next = nextGroup;

            // 5️⃣ Move prevGroup
            prevGroup = groupStart;
        }

        return dummy.next;
    }
    public ListNode reverse(ListNode temp){
        ListNode cur = null;
        ListNode ans = temp;
        while(temp != null){
            ListNode kk = temp.next;
            temp.next = cur;
            cur = temp;
            temp = kk;
        }
        return cur;
    }
}