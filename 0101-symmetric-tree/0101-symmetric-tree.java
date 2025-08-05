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
    public boolean isSymmetric(TreeNode root) {
        TreeNode root1 = root.left;
        TreeNode root2 = root.right;
        
        return is(root1,root2);
    }
    public boolean is(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null ){
            return true;
        }
        if(root1 == null || root2 == null ){
            return false;
        }
        if(root1.left == null && root2.right != null || root2.left == null && root1.right != null){
            return false; 
        }
        return (root1.val == root2.val && is(root1.left,root2.right) &&  is(root2.left,root1.right));
        
    }
}