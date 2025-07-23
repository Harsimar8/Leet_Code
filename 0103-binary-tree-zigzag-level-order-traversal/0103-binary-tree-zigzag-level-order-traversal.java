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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return res;
        }
        q.offer(root);
        boolean lefttoright = true;
        while(!q.isEmpty()){
            int si = q.size();
            List<Integer> level = new ArrayList<>();
        
        for(int i =0; i<si; i++){
            TreeNode n = q.poll();
            if(lefttoright == true){
                level.add(n.val);
            }
            else{
                level.add(0,n.val);
            }

            if(n.left!= null){
                q.offer(n.left);
            }
            if(n.right!= null){
                q.offer(n.right);
            }
        }
        lefttoright = ! lefttoright;
        res.add(level);
        }
        return res;
    }
}