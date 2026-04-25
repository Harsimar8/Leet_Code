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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            mpp.put(inorder[i],i);
        }
        return helper(inorder, preorder, 0, preorder.length -1, 0, inorder.length-1, mpp);
    }
   public TreeNode helper(int[] inorder, int[] preorder, int preS, int preE, int inS, int inEnd, HashMap<Integer, Integer> mpp){
        if(preS > preE || inS > inEnd){
            return null;
        }
        int inroot = mpp.get(preorder[preS]);
        TreeNode root = new TreeNode(preorder[preS]);
        int nums = inroot - inS;
        root.left = helper(inorder, preorder, preS + 1, preS + nums, inS, inroot - 1,  mpp);
        root.right = helper(inorder, preorder, preS + nums + 1, preE, inroot +1, inEnd,  mpp);
        return root;
    }
}