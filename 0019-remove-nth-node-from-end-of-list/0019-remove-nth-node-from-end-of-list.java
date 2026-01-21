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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int cnt = 1;

        ListNode temp = head;
        ListNode res = head;
        ListNode ans = head;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
         if(n == cnt){
            return head.next;
        }
        int pp = 0;
        int k = cnt - n;
        ListNode cur = null;
        while(res != null){
            cur = res.next;
            pp++;
            
            if(pp == k){
                break;
            }
            res = res.next;
        }
        res.next =  cur.next;
        return ans;
    }
}