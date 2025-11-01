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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> mp = new HashSet<>();
        for(int a : nums){
            mp.add(a);
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        dummy.next = head;
        ListNode cur = head;
        while(cur != null){
            if(mp.contains(cur.val)){
                prev.next = cur.next;
            }
            else{
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}