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
         HashMap<TreeNode,TreeNode> parent = new HashMap<>();

        q.add(root);
        if(root == null){
            return null;
        }
        while(!q.isEmpty()){
            int s = q.size();
            for(int i =0; i<s; i++){
                TreeNode pair  = q.poll();
                if(pair.left != null){
                    mpp.put(pair.left, pair);
                    q.offer(pair.left);
                }
                if(pair.right != null){
                    mpp.put(pair.right,pair);
                    q.offer(pair.right);
                }
                
            }
        }
        int value =0;
        q1.offer(target);
        visited.put(target,true);
        while(!q1.isEmpty()){
            int ss = q1.size();
            
            if(value == k){
                break;
            }
            for(int i =0; i<ss; i++){
                TreeNode qq = q1.poll();
                
                if( qq.left!= null && !visited.containsKey(qq.left)){
                    q1.offer(qq.left);
                    visited.put(qq.left,true);
                }
                if( qq.right!= null && !visited.containsKey(qq.right)  ){
                    q1.offer(qq.right);
 visited.put(qq.right,true);
                }
                if(mpp.containsKey(qq) && !visited.containsKey(mpp.get(qq))){
                   q1.offer(mpp.get(qq));
                   visited.put(mpp.get(qq),true);
                }
                
                
                // if(parent.containsKey(qq) && !visited.containsKey(parent.get(qq))) {
                //     q1.add(parent.get(qq));
                //     visited.put(parent.get(qq), true);
                // }
            }
            value++;
            
            
        }
            
            List<Integer> list = new ArrayList<>();
            
            for(TreeNode tree  : q1){
                list.add(tree.val);
            }
             
        
       return list;
    }
}