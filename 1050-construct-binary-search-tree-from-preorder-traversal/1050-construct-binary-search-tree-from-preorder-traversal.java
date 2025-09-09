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
    public TreeNode bstFromPreorder(int[] preorder) {
        List<Integer> list = new ArrayList<>();
        for(int j =0; j<preorder.length; j++){
            list.add(preorder[j]);


        }
        int[] i = {0};
        return build(list, i, Integer.MAX_VALUE);
    }
    public TreeNode build(List<Integer> A, int[] i, int bound){
        if(i[0] == A.size() || A.get(i[0]) > bound){
            return null;
        }
        TreeNode cur = new TreeNode(A.get(i[0]++));
        cur.left = build(A, i , cur.val);
        cur.right = build(A, i, bound);
        return cur;
    }
}