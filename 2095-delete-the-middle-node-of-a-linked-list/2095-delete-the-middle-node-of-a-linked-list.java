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
    public ListNode deleteMiddle(ListNode head) {
         ListNode temp = head;
         if(head.next == null){
            return null;
         }
         int cnt1 =0;
         ListNode res = head;
         ListNode ans = head;
         while(temp.next != null){
            cnt1++;
            temp = temp.next;
         }    
         
         cnt1 += 1;
         if(cnt1 == 2){
            head.next = null;
            return head;
         }
         int k =0;       
         
            k = cnt1/2;
            
         
         int n = 0;
         ListNode cur = null;
         while(res != null){
            cur = res.next;
            if(n == k-1){
                break;
            }
            
            
            res = res.next;
            n++;
         }
         res.next = cur.next;

         return ans;
    }
}