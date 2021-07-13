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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        //the way we work here is as follows 
        
       // 1. Initialize the values arraylist we have 
        List<List<Integer>> values = new ArrayList<>();
        
        // 2. If the root is null we return values arraylist 
        if(root == null)
        {
            return values;
        }
        // 3. We initialise the Queue
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        // 4. Add the value to the queue
        q.add(root);
        
        // 5. While the queue is not empty we can work along with it.
        while(!q.isEmpty())
        {
            // while the value of the queue is not empty what we need to do is as follows
            
         List<Integer> val = new ArrayList<>();
            
        int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode valler = q.remove();
                val.add(valler.val);
            
            
            if(valler.left!=null)
            {
                q.add(valler.left);
            }
            if(valler.right!=null)
            {
                q.add(valler.right);
            }
            }
            values.add(val);
        }
        return values;
    }
}

// https://leetcode.com/problems/binary-tree-level-order-traversal/
