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
    public TreeNode invertTree(TreeNode root) {
     
        // so here we need to understand how will we invert a binary tree.
        // first let us discuss the iterative solution we can work as follows.
        
        /*Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null)
        {
            return root;
        }
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            // once swapped we will add it to the queue
            if(current.left!=null)
            {
                queue.add(current.left);
            }
            if(current.right!=null)
            {
                queue.add(current.right);
            }
        }
        return root;*/
        
        
        // now for the recursive case the way we work is as follows
        if(root == null)
        {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.right = left;
        root.left = right;
        return root;
        
    }
}
