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
    public boolean checkTree(TreeNode root) {
       if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        if(!(root.left.val + root.right.val == root.val)&& root.left == null || root.right == null){
            return false;
        }
        
        
        
        return (root.left.val + root.right.val == root.val) && checkTree(root.left)
        && checkTree(root.right) ;
    }
}