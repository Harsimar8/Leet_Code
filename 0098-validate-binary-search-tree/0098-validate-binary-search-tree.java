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
    public boolean isValidBST(TreeNode root) {
        if(root != null && root.left == null && root.right == null ){
            return true;
        }
        
        long maxi = Long.MIN_VALUE;
        long mini = Long.MAX_VALUE;
        return helper(root, mini, maxi);
    }
    public boolean helper(TreeNode root, long a,  long b){
        if(root == null){
            return true;
        }
        else if(root.val <= b || root.val >= a){
            return false;
        }
        return helper(root.left, root.val, b) && helper(root.right ,a, root.val);
    }
}