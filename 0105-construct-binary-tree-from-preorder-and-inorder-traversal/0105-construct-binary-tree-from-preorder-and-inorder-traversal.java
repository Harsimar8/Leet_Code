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
    private HashMap<Integer , Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         if(preorder.length != inorder.length){
            throw new IllegalArgumentException("Length of both are not same");
        }
        indexMap = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            indexMap.put(inorder[i] , i);
        }
        return  constructTreeHelper(preorder,inorder , 0,preorder.length-1, 0 , inorder.length -1);
    }

    private  TreeNode constructTreeHelper(int[] preorder , int[] inorder , int preStart, int preEnd, int inStart , int inEnd){
        if(preStart> preEnd || inStart> inEnd){
            return null;
        }
        int rootData = preorder[preStart];
        TreeNode root = new TreeNode(rootData);
        int rootIndex = indexMap.get(rootData);

        int leftTreeSize = rootIndex - inStart;
        root.left = constructTreeHelper(preorder,inorder, preStart+1, preStart+ leftTreeSize, inStart, rootIndex-1);
        root.right = constructTreeHelper(preorder,inorder, preStart+ leftTreeSize + 1, preEnd, rootIndex+ 1, inEnd);
        return  root;



    }

}