/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        TreeNode temp = root;
        if(root == null){
            return 0;
        }
        int cnt1 =1;
        int cnt2 =1;
        while(root.left!= null){
            cnt1++;
            root = root.left;
        }
        root = temp;
        while(root.right != null){
            cnt2++;
            root = root.right;
        }
        TreeNode l = temp;
        TreeNode r = temp;
        if(cnt1 == cnt2){
            return (int)(Math.pow(2,cnt1)) -1;
        }
        else{
           return  1 + countNodes(l.left) + countNodes(r.right);
        }
    }
}