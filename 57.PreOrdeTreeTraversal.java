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
   //  List<Integer> values = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) 
    {
      // the recursive solution to 
      // V - L - R
      //  if(root!=null)
      //  {
      //      values.add(root.val);
       //     preorderTraversal(root.left);
        //    preorderTraversal(root.right);
       // }
      //  return values;
        
        // NOW THE WAY IT WORKS IS AS FOLLOWS
        List<Integer> values = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null)
        {
            return values;
        }
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            values.add(node.val);
            if(node.right!=null)
            {
             stack.push(node.right);
            }
            if(node.left!=null)
            {
              stack.push(node.left);
            }
        }
        return values;
    }
}
