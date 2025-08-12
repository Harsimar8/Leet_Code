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
    public int cnt =0;
    public int countNodes(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        return preOrder(root, res);
    }
    public int preOrder(TreeNode root, List<Integer> res){
        if(root == null){
            return 0;
        }
        
        
        preOrder(root.left, res);
        res.add(root.val);
        cnt++;
        preOrder(root.right, res);
        
        return cnt;
    }
}