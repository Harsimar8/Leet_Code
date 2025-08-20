/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> mpp = new HashMap<>();
        HashMap<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        // if(root == null){
        //     return null;
        // }
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i =0; i<s; i++){
                TreeNode qq = q.poll();
                if(qq.left!= null){
                    mpp.put(qq.left, qq);
                    q.offer(qq.left);
                }
                if(qq.right!= null){
                    mpp.put(qq.right, qq);
                    q.offer(qq.right);
                }

            }
        }
        int value = 0;
        q1.offer(target);
        visited.put(target,true);
        while(!q1.isEmpty()){
            if(value == k){
                break;
            }
            int si = q1.size();
            
            for(int i =0; i<si; i++){
                TreeNode nn = q1.poll();
                if( nn.left!= null && !visited.containsKey(nn.left)){
                    
                    q1.offer(nn.left);
                    visited.put(nn.left,true);
                }
                if(nn.right!= null && !visited.containsKey(nn.right)){
                    
                    q1.offer(nn.right);
                    visited.put(nn.right,true);
                }
                if(mpp.containsKey(nn) && !visited.containsKey(mpp.get(nn))){
                    TreeNode val = mpp.get(nn);
                    q1.offer(val);
                    visited.put(val, true);
                }
                
            }
            value++;
        }
         List<Integer>   ans = new ArrayList<>();
         for(TreeNode tr : q1){
           
            ans.add(tr.val);
         }
         return ans;
    }
}