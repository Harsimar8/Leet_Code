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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(root, res, ans, targetSum,0);
        return res;
    }
    public void helper(TreeNode root, List<List<Integer>> res,List<Integer> ans, int sum, int ss){
        if(root == null){
            return;
        }
        ans.add(root.val);
        ss += root.val;
        if(root.left == null && root.right == null){
            // int total = 0;
            // for(int a : ans){
            //     total += a;
            // }
            if(ss == sum){
            res.add(new ArrayList<>(ans));
            ss = 0;
            }
            ans.remove(ans.size() -1);
            return;
        }
        helper(root.left, res, ans, sum,ss);
        helper(root.right, res, ans, sum,ss);
        ans.remove(ans.size() -1);
    }
}