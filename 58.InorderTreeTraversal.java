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
   List<Integer> values = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        // L- V - R
    /*    if(root!=null)
        {
            inorderTraversal(root.left);
            values.add(root.val);
            inorderTraversal(root.right);
        
        }
        return values;*/
        
        // NOW WE TALK ABOUT THE ITERATIVE SOLUTION.
        if(root==null)
        {
            return values;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
    // here we run a while loop till it is true and work as follows
        while(true)
        {
            // the way we work for it is as follows
            if(root!=null)
            {
                stack.push(root);
                root=root.left;
            }
            else
            {
                if(stack.isEmpty()){break;}
                root = stack.pop();
                values.add(root.val);
                root=root.right;
            }
        }
        return values;
        
    }
}
