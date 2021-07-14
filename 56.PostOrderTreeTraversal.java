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
class Solution
{
    List<Integer> values = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root)
    {
        
        
        //POST ORDER TRAVERSAL USING RECURSION
        
        if(root==null)
        {
            return values ;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        values.add(root.val);
        return values;
        
     /*   List<Integer> values = new ArrayList<Integer>();
        // so the way we work is as follows.
        
         HERE WE USE CONCEPT OF USING TWO STACKS 
         S1 is to keep track of the current node values that we have 
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        if(root==null)
        {
            return values;
        }
        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode t = s1.pop();
            // so the way it works is as follows
            s2.push(t);
            if(t.left!=null)
            {
                s1.push(t.left);
            }
            if(t.right!=null)
            {
                s1.push(t.right); 
            }
        }
        
        
        
        // so the way we work is as follows
        while(!s2.isEmpty())
        {
            TreeNode valler = s2.pop();
            values.add(valler.val);
        }
        return values;*/
        
    }
}
