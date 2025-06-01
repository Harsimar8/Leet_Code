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
        ListNode d = new ListNode(-1); 
        ListNode ll1 = l1;
        ListNode ll2 = l2;
        ListNode temp =d;
        
        int sum =0;
        int carry =0;
           
        while(ll1!= null || ll2 != null || carry >0){
            int a  = (ll1!= null) ? ll1.val : 0;
            int b = (ll2!= null) ? ll2.val : 0;
        
        sum = a + b + carry;
        int digit = sum % 10;
        temp.next = new ListNode(digit);
        carry = sum /10;
        temp = temp.next;
        if(ll1!= null){
            ll1 = ll1.next;
        }
        if(ll2 != null){
            ll2 = ll2.next;
        }
        
        
        }
        return d.next;
        
    }

    
  
}