/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return "";
        }
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode ni = q.poll();
            if(ni == null){
                sb.append("#,");
            }
            else{
                sb.append(ni.val).append(",");
                q.offer(ni.left);
                q.offer(ni.right);
            }
        }
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nod = data.split(",");
        Queue<TreeNode> q= new LinkedList<>();
        if(data.length() == 0){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nod[0]));
        q.offer(root);
        int i =1;
        while(!q.isEmpty()){
            TreeNode ni = q.poll();
            if(i < nod.length && !nod[i].equals("#")){
                TreeNode curr = new TreeNode(Integer.parseInt(nod[i]));
                ni.left = curr;
                q.offer(curr);
            }
            i++;
             if(i < nod.length && !nod[i].equals("#")){
                TreeNode cu = new TreeNode(Integer.parseInt(nod[i]));
                ni.right = cu;
                q.offer(cu);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));