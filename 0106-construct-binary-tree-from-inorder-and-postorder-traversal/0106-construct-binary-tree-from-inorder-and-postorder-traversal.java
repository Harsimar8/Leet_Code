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
    private HashMap<Integer , Integer> indexMap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length){
            throw new IllegalArgumentException("Length of both the arrays are not same");
        }
        indexMap = new HashMap<>();
        for(int i =0; i<inorder.length; i++){
            indexMap.put(inorder[i],i);
        }
        return constructTree(postorder , inorder, 0 , postorder.length -1 ,
         0 , inorder.length-1);
    }
    private TreeNode constructTree(int[] postorder , int[] inorder ,int postStart , int postEnd , int inStart , int inEnd){
        if(postStart > postEnd || inStart > inEnd){
            return null;
        }
        int rootData = postorder[postEnd];
        TreeNode root  =new TreeNode(rootData);
        int rootIndex = indexMap.get(rootData); 
        int leftTreeSize = rootIndex - inStart;

        root.left = constructTree(postorder,inorder , postStart , postStart +leftTreeSize -1, inStart , rootIndex -1);
        root.right = constructTree(postorder , inorder , postStart+leftTreeSize , postEnd -1,rootIndex +1 , inEnd);
        return root;

    }
}