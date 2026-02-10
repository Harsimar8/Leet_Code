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
    class Result{
        int h;
        TreeNode node;
        Result(int h, TreeNode node){
            this.h = h;
            this.node = node;
        }
    }
    public Result dfs(TreeNode root){
        if(root == null){
            return new Result(0,null);
        }
        Result left = dfs(root.left);
        Result right = dfs(root.right);
        if(left.h > right.h){
            return new Result(left.h+1, left.node);
        }
        if(right.h > left.h){
            return new Result(right.h+1,right.node);
        }
        else{
            return new Result(left.h+1, root);
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }
}