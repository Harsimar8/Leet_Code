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
    public int maxProduct(TreeNode root) {
        long total = sum(root);
        long ans = 1000000000 + 7;
        Queue<TreeNode> q= new ArrayDeque<>();
        q.offer(root);
        long maxi =0;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            long curr= (node.val) * (total - node.val);
            maxi = Math.max(curr, maxi);
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }
        }
        return (int)(maxi%ans);
    }
    public int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        root.val += sum(root.left) + sum(root.right);
        return root.val;
    }
}