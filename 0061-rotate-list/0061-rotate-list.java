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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int ind = 0;
        int[] res = new int[arr.size()];
        for(int a : arr){
            res[ind++] = a;
        }
        
        int n = arr.size();
        k = k%n;

        reverse(res,0,n-1);
        reverse(res,0,k-1);
        reverse(res,k,n-1);
        ListNode dummy  = new ListNode(-1);
        ListNode ans = dummy;
        for(int num : res){
            ans.next = new ListNode(num);
            ans = ans.next;
        }
        return dummy.next;
    }
    public void reverse(int[] nums, int s, int e){
        int n = nums.length;
        while(s <= e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        
    }
}