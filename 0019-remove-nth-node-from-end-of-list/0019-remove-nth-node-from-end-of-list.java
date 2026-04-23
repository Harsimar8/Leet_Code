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
        int cnt =0;
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        ListNode ans = head;
        ListNode res = ans;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        int k = cnt-n+1;
        int i = 1;
        if(cnt == n){
            return head.next;
        }
        ListNode prev = null;
        while(ans != null){
            prev = ans.next;
            i++;
            if(i == k){
                break;
            }
            
            ans = ans.next;
        }
        if(prev.next == null){
            ans.next = null;
        }
        else{
        ans.next = prev.next;
        }
        return res;

    }
}