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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        int q = preorder.length;
        for(int i =0; i<n; i++){
            mpp.put(inorder[i],i);
        }    
        return build(preorder, 0, preorder.length -1, inorder, 0, inorder.length -1);
    }
    public TreeNode build(int[] preorder, int preS, int preE, int[] inorder, int inS ,int  inE){
        if(preS > preE || inS > inE){
            return null;
        }
        int value = preorder[preS];
        TreeNode root = new TreeNode(value);
        int inIndex  =  mpp.get(root.val);
        int left = inIndex - inS;
        root.left = build(preorder, preS + 1, preS+left, inorder , inS, inIndex -1);
        root.right = build(preorder, preS + left+1, preE, inorder , inS + left + 1, inE);
        return root;
    }

}