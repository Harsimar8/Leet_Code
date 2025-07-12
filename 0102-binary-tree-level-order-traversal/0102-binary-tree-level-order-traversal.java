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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        if(root == null){
            return res;
        }
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i =0; i<s; i++){
                TreeNode n = q.poll();
                level.add(n.val);
                if(n.left!= null){
                    q.offer(n.left);
                }
                if(n.right!= null){
                    q.offer(n.right);
                }

            }
            res.add(level);
        }
        return res;
    }
}