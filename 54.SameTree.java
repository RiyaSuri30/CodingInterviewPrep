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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // so how does the same tree concept work
        
        
        // if we consider the concept of the p and q if null then we can hve it 
        if(p==null && q==null)
        {
            return true;
        }
        
        // if we consider the p and q then we can look into as follows if p is null or q is null then we can consider as follows 
        if(p==null || q ==null)
        {
            return false;
        }
        
        //go into recusrison
        return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
// https://leetcode.com/problems/same-tree/
