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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;

        }
        Queue<Pair<TreeNode , Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root,0));
        int maxi = Integer.MIN_VALUE;
        int indexL =0;
        int indexR = 0;
        int left =0;
        int right =0;
        int width =0;                                
        while(!q.isEmpty()){
            int size = q.size();
            indexL = 2 * left + 1;
            indexR = 2 * right + 2;
            boolean first = true;
            for(int i =0; i<size; i++){
            Pair<TreeNode, Integer> pair= q.poll();
            int curr = pair.getValue();
            if(first){
            left = curr;
            right = curr;
            first = false;
            }else{
            right = curr;
            }
    
            indexL = 2 * curr + 1;
            indexR = 2 * curr + 2;
            if(pair.getKey().left!= null){
                q.add(new Pair<>(pair.getKey().left,indexL));
            }
            if(pair.getKey().right!= null){
                q.add(new Pair<>(pair.getKey().right,indexR));
            }
            }
            width = (right - left) + 1;
            maxi = Math.max(maxi, width);
            
        }
        return maxi; 
    }
}