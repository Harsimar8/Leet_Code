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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int level = 0;
        rightV(root, level, ans);
        return ans;
    }
    public void rightV(TreeNode root, int level, List<Integer> ans){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            ans.add(root.val);
        }
        level++;
        rightV(root.right, level, ans);
        rightV(root.left, level, ans);
    }

}