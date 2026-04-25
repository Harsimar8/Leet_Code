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
        if(head == null  || n == 0){
            return head;
        }
       
        int cnt = 0;
        ListNode temp = head;
        ListNode cur = head;
        ListNode ans = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int k = cnt - n + 1;
        if(cnt == n){
            return head.next;
        }
        int ind = 1;
        ListNode prev = null;
        while(ans != null){
            prev = ans.next;
            ind++;
            if(ind == k){
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
        return head;

        


    }
}