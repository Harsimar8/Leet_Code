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
    public int maxPathSum(TreeNode root) {
       
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxDepth(root, maxVal);
        return maxVal[0];
    }
    public int maxDepth(TreeNode root, int[] maxVal){
        if(root == null){
            return 0;
        }
        
        int lh = Math.max(maxDepth(root.left,maxVal),0);
        int rh = Math.max(maxDepth(root.right, maxVal),0);
       
        
        maxVal[0] = Math.max(maxVal[0], root.val + lh + rh);
        return root.val + Math.max(lh,rh);
    }
}