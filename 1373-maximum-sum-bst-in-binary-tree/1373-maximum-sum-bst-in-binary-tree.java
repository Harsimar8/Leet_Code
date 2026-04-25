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
class newNode{
    int maxSum;
    int minVal;
    int maxVal;
    newNode(int maxSum, int minVal, int maxVal){
        this.maxSum = maxSum;
        this.minVal = minVal;
        this.maxVal = maxVal;
    }
}
class Solution {
    public int maxi =0;
    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxi;
    }
    public newNode helper(TreeNode root){
        if(root == null){
            return new newNode(0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        newNode left = helper(root.left);
        newNode right = helper(root.right);

        if(left.maxVal < root.val && right.minVal > root.val){
            int curSum = left.maxSum + right.maxSum + root.val;

            maxi = Math.max(curSum, maxi);
            int minVal = Math.min(left.minVal, root.val);
            int maxVal = Math.max(right.maxVal, root.val);

            return new newNode(curSum , minVal, maxVal);

        }
        return new newNode(0,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}