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
         boolean leftToright = true;
        while(!q.isEmpty()){
            int s = q.size();
           
            List<Integer> level = new ArrayList<>();
            for(int i =0; i<s; i++){
                TreeNode n = q.poll();
                if(leftToright == true){
                    level.add(n.val);
                }
                else if(leftToright == false){
                    level.add(0,n.val);
                }

                if(n.left!= null){
                    q.offer(n.left);
                }
                if(n.right!= null){
                    q.offer(n.right);
                }
                
            }
            leftToright = !leftToright;
            res.add(level);
        }
        return res;
    }
}