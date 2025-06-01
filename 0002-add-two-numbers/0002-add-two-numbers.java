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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode d = new ListNode(-1);
        ListNode temp = d;
        int sum =0;
        int carry =0;
        while(p1 != null || p2!= null || carry >0){
            int a = (p1!= null ) ? p1.val : 0;
            int b = (p2!= null) ? p2.val : 0;
            sum =a + b + carry;
            int digit = sum % 10;
            temp.next= new ListNode(digit);
            carry = sum / 10;

            
            if(p1 != null){
                p1 = p1.next;
            }
            if(p2!= null){
                p2 = p2.next;
            }
            temp = temp.next;
        }
        return d.next;
    }
}