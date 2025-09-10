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
    public boolean findTarget(TreeNode root, int k) {
        BTS l  =new BTS(root,false);
        BTS r = new BTS(root,true);
        int i = l.next();
        int j = r.next();
        while(i < j){
            if(i  +j == k){
                return true;
            }
            else if(i  +j < k){
                i = l.next();
            }
            else{
                j = r.next();
            }
        }
        return false;
    }
    class BTS{
        Stack<TreeNode> st = new Stack<>();
        boolean reverse;
        BTS(TreeNode root, boolean is){
            st = new Stack<>();
            reverse =is;
            pushAll(root);
        }
    public void pushAll(TreeNode root){
        while(root != null){
            st.push(root);
            if(reverse){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
    }
    public int next(){
        TreeNode cur = st.pop();
        if(reverse){
            pushAll(cur.left);
        }
        else{
            pushAll(cur.right);

        }
        return cur.val;
    }
    }

}