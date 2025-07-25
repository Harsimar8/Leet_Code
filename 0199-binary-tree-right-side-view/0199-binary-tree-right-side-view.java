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
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getKey() {
        return first;
    }

    public U getValue() {
        return second;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> mpp = new TreeMap<>();
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        q.offer(new Pair<>(root,0));
        int line =0;
        mpp.put(0,root.val);
        while(!q.isEmpty()){
            Pair<TreeNode, Integer> pair = q.poll();
            TreeNode noo = pair.getKey();
            line = pair.getValue();
            
            mpp.put(line, noo.val);
            
           
            line++;
            if(noo.left!= null){
                q.offer(new Pair(noo.left, line));
            }
            if(noo.right != null){
                q.offer(new Pair(noo.right, line));
            }
        }
        for(int val : mpp.values()){
            ans.add(val);
        }
        return ans;
    }
}