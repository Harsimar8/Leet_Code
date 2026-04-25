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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            mpp.put(inorder[i],i);
        }
        return helper(inorder, postorder, 0, postorder.length -1, 0, inorder.length-1, mpp);
    }
    public TreeNode helper(int[] inorder, int[] postorder, int postS, int postE, int inS, int inEnd, HashMap<Integer, Integer> mpp){
        if(postS > postE || inS > inEnd){
            return null;
        }
       
        TreeNode root = new TreeNode(postorder[postE]);
         int inroot = mpp.get(root.val);
        int nums = inroot - inS;
        root.left = helper(inorder, postorder, postS, postS + nums -1, inS, inroot - 1, mpp);
        root.right = helper(inorder, postorder, postS + nums, postE - 1, inroot + 1, inEnd, mpp);
        return root;
    }
}