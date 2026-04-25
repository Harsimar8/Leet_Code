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

class Pair{
    TreeNode nbr;
    int val;
    Pair(TreeNode nbr, int val){
        this.nbr = nbr;
        this.val = val;
    }
} 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(root, 0));
        int maxi  = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        while(!q.isEmpty()){
            int ss = q.size();
            for(int i =0; i<ss; i++){
                Pair nn = q.poll();
                TreeNode a = nn.nbr;
                int b = nn.val;
                if(i == 0){
                    start = b;
                }
                if(i == ss -1){
                    end= b;
                }
                if(a.left != null){
                    q.offer(new Pair(a.left, 2 * b+1));
                }
                if(a.right != null){
                    q.offer(new Pair(a.right, 2 * b+2));
                }
                
            }
            maxi = Math.max(maxi, end - start + 1);
        }
        return maxi;
    }
}