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
    class Pair{
        TreeNode ab;
        int ac;
        Pair(TreeNode ab, int ac){
            this.ab = ab;
            this.ac = ac;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root,0));
        int maxi =0;
        int start =0;
        int end =0;
        while(!q.isEmpty()){
            int ss = q.size();
            for(int i =0; i<ss; i++){
                Pair nbr = q.poll();
                TreeNode node = nbr.ab;
                int idx = nbr.ac;
                if(i == 0){
                    start = idx;
                }
                if(i == ss-1){
                    end = idx;
                }
                if(node.left != null){
                    q.offer(new Pair(node.left, 2 * idx+1));
                }
                if(node.right != null){
                    q.offer(new Pair(node.right, 2 * idx+2));
                }
            }
            maxi = Math.max(maxi, end-start+1);
        }
        return maxi;
    }
}