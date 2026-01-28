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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevG = dummy;
        while(true){
            ListNode kth = prevG;
            for(int i =0; i<k && kth != null; i++){
                kth = kth.next;
            }
            if(kth == null){
                break;
            }
            
            ListNode groupS = prevG.next;
            ListNode nextG = kth.next;

            kth.next = null;
            ListNode newH = rev(groupS);
            prevG.next = newH;
            groupS.next = nextG;
             
            prevG = groupS;
            groupS = nextG;
            

        } 
        return dummy.next;
    }
    public ListNode rev(ListNode temp){
        ListNode cur = null;
        ListNode ans = temp;
        while(temp!= null){
            ListNode kk = temp.next;
            temp.next = cur;
            cur = temp;
            temp = kk; 
        }
        return cur;
    }
}