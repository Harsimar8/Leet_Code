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
        ListNode ans = new ListNode(-1);
        ListNode res = ans;
        int carry = 0;
        int sum =0;
        int ok = 0;
        while(l1 != null && l2 != null){
             sum = l1.val + l2.val;
             if(carry != 0){
                sum += carry;
                carry = 0;
             }
             if(sum > 9){
                int val = sum%10;
                sum/=10;
                carry = sum;
                ans.next = new ListNode(val);
             }
             else{
                ans.next = new ListNode(sum);
             }
             
            ans= ans.next;
            l1 = l1.next;
            l2= l2.next;
           
        
        }
        while(l1 != null){
            int val = l1.val + carry;
            int jk = val%10;
            val = val/10;
            carry = val;
            ans.next = new ListNode(jk);
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2 != null){
             int val = l2.val + carry;
            int jk = val%10;
            val = val/10;
            carry = val;
            ans.next = new ListNode(jk);
            ans = ans.next;
            l2 = l2.next;
        }
        if(carry != 0){
            ans.next = new ListNode(sum);
            ans= ans.next;
        }
        
        
        return res.next;

    }
}