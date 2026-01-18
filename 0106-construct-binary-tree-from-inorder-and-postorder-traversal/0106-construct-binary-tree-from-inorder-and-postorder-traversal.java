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
 import java.util.*;
class Solution {
    public TreeNode buildTree(int[] in, int[] post) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
      for(int i =0; i<in.length ; i++){
          mpp.put(in[i],i);
      }
      return build(in,post,0,post.length-1,0, in.length -1,mpp);
    }

   static TreeNode build(int[] in, int[] post, int preS, int preE, int inS, int inE,HashMap<Integer,Integer> mpp){
        if(preS > preE || inS > inE){
            return null;
        }
        int inroot = mpp.get(post[preE]);
        TreeNode root = new TreeNode(post[preE]);
        int nums = inroot - inS;
        root.left = build(in,post,preS, preS + nums -1, inS, inroot - 1,mpp);
        root.right = build(in,post,preS + nums , preE - 1,inroot +1, inE, mpp);
        return root;    
    }
}