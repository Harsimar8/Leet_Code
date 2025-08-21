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
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> mpp = new HashMap<>();
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        if(root.left== null && root.right == null){
            return 0;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i =0; i<s; i++){
                TreeNode n1 = q.poll();
                if(n1.left != null){
                    mpp.put(n1.left,n1);
                    q.offer(n1.left);
                }
                if(n1.right != null){
                    mpp.put(n1.right,n1);
                    q.offer(n1.right);
                }
            }
        }
        
        TreeNode target = find(root,start);
        int t =0;
        q1.offer(target);
        visited.put(target, true);
        
        while(!q1.isEmpty()){
            int si = q1.size();
           
           boolean flag = false;
                
                for(int i =0; i<si; i++){
                    TreeNode dd = q1.poll();
                if(dd.left!= null && !visited.containsKey(dd.left)){
                    flag = true;
                    q1.offer(dd.left);
                    visited.put(dd.left,true);
                
                }
                if(dd.right != null && !visited.containsKey(dd.right)){
                    flag = true;
                    q1.offer(dd.right);
                    visited.put(dd.right,true);
                }
                if(mpp.containsKey(dd) && !visited.containsKey(mpp.get(dd))){
                    flag = true;
                    TreeNode val = mpp.get(dd);
                    q1.offer(val); 
                    visited.put(val, true);
                }
                }
                
               if(flag){
                t++;
               }
            
        }
        return t;

    }
    public TreeNode find(TreeNode root, int target){
        if(root== null){
            return null;
        }
        if(root.val == target){
            return root;
        }
        TreeNode left = find(root.left,target);
        
        if(left!= null){
            return left;
        }
       
        return find(root.right, target);
    }
}