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
    Long min = Long.MIN_VALUE;
    Long max = Long.MAX_VALUE;
    public boolean isValidBST(TreeNode root) 
    {
        // for a given binary search tree check if it is a valid binary search tree or not.
        
        // the way we will code for it is as follows
        
        return Helper(root,min,max);
    }
    public boolean Helper(TreeNode root,long min , long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=min || root.val >= max)
        {
         return false;   
        }
        boolean isValidateBST = Helper(root.left,min,root.val);
        return isValidateBST & Helper(root.right,root.val,max);
    }
}
