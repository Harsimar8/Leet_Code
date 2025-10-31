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
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            mpp.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, preorder.length -1, 0, inorder.length -1, mpp);
    }
    public TreeNode build(int[] preorder,int[] inorder, int preS, int preE, int inS, int inE,HashMap<Integer,Integer> mpp){

        if(preS > preE || inS > inE){
            return null;
        } 
        TreeNode root = new TreeNode(preorder[preS]);
        int inroot = mpp.get(root.val);
        int nums = inroot - inS;
        root.left = build(preorder,inorder,preS + 1,preS + nums , inS, inroot-1,mpp);
        root.right = build(preorder,inorder,preS + nums + 1, preE, inroot + 1, inE,mpp);
        return root;
    }
}