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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode oddH = head;
        ListNode last = oddH;
        ListNode even = oddH.next;
        ListNode evenH = even;
        while(even != null && even.next != null){
            oddH.next = even.next;
            oddH = oddH.next;

            even.next = oddH.next;
            even = even.next;
        }
        oddH.next = evenH;
        return last;
        
    }
}