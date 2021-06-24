//FIRST WE ARE TALKING ABOUT RECURSIVE SOLUTION 

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
    //make an arraylist of integers
    List<Integer> values = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
      // if root != null then return values else
      if(root!=null)
      {
        //traverse left
          inorderTraversal(root.left);
        // add value
          values.add(root.val);
        // traverse right
          inorderTraversal(root.right);
      }
     return values;   
    
    
    
    
}
}


// ITERATIVE SOLUTION
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
    
  //  List<Integer> values = new ArrayList<Integer>();
    List<Integer> res = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public List<Integer> inorderTraversal(TreeNode root)
    {
  
     TreeNode curr = root;
      
      // only if both stack is also empty and curr is also null then 
     while(curr!=null || !stack.isEmpty())
     {
       // till current is not null push left in stack
         while(curr!=null)
         {
             stack.push(curr);
             curr=curr.left;
         }
         // pop the values out
         curr = stack.pop();
       // add to res
         res.add(curr.val);
       // and check the right
         curr=curr.right;
     }
    return res;
}
}




