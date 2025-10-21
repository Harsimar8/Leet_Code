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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(head == null){
            return null;
        }
        ListNode nextN = temp.next;
        ListNode ans = head;
        while(temp.next != null){
            ListNode cur = nextN.next;
            
            ListNode temp1 = temp;
            if(nextN.val == temp.val){
                temp.next = cur;
               
            }
            
            if(temp.next != null && temp.val != nextN.val){
            temp = temp.next;
            
            }
            nextN = temp.next;
        }
        return ans;
    }
}