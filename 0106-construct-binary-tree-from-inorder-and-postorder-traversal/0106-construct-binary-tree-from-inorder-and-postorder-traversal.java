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
    public HashMap<Integer, Integer> mpp = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int in = inorder.length;
        int post = postorder.length;
        for(int i =0;i< in; i++){
            mpp.put(inorder[i],i);
        }
        return build(inorder, 0, inorder.length -1, postorder, 0 , postorder.length -1);    
    }
    public TreeNode build(int[] inorder, int inS , int inE , int[] postorder, int postS, int postE){
        if(inS > inE || postS > postE ){
            return null;

        }
        int value = postorder[postE];
        TreeNode root = new TreeNode(value);
        int inIndex = mpp.get(root.val);
        int left = inIndex - inS;
        root.left = build(inorder, inS , inIndex -1,  postorder, postS , postS + left -1);
        root.right = build(inorder, inIndex +1, inE, postorder, postS + left, postE - 1);
        return root;
    }


}