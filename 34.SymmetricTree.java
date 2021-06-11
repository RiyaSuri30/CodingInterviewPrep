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
    public boolean isSymmetric(TreeNode root)
    {
      if(root==null)
      {
          return true;
      }
     return check(root.left,root.right);
    }
    public boolean check(TreeNode leftsub, TreeNode rightsub)
    {
        if(leftsub==null && rightsub==null)
        {
            return true;
        }
        else if(leftsub!=null && rightsub!=null)
        {
            return leftsub.val == rightsub.val && check(leftsub.right,rightsub.left) && check(leftsub.left,rightsub.right);
        }
        return false;
    }
}
