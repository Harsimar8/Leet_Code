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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode new1 = new TreeNode(val);
                root = new1;
                return root;
            
        }
        TreeNode cur = root;
        while(cur!= null){
            if(val > cur.val){
                if(cur.right != null){
                    cur = cur.right;
                }
                else{
                    TreeNode new1 = new TreeNode(val);
                    cur.right = new1;
                    break;
                }
            }
            else if(val < cur.val){
                if(cur.left != null){
                    cur = cur.left;
                }
                else{
                    TreeNode new1 = new TreeNode(val);
                    cur.left = new1;
                    break;
                }
            }
        }
        return root;
    }
}