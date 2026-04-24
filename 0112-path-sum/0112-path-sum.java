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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                return true;
            }
            else{
                return false;
            }
        }
        return helper(root, targetSum-root.val);
    }
    public boolean helper(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.left ==null && root.right == null){
            if(target == 0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean left =false;
        boolean right =false;
        if(root.left != null){
            left = helper(root.left, target - root.left.val);
        }
        if(root.right != null){
         right = helper(root.right, target - root.right.val);
        }
        return left || right;

    }
}