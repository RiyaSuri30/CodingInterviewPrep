/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // so the way the lowest common ancestor can work is as follows
        //the way we can work here can be considered as follows
        
        // so if the value of the root is null then return null simply 
        if(root==null)
        {
            return null;
            
        }
        // if it is equal to any of the root value then simply return the root value that we have.
        if(root==p || root ==q)
        {
            // agar directly equal hai return root;
            return root;
        }
        // then we can consider the left node
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        // consider the right node
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        
        // if both are null return null
        if(left==null && right==null)
        {
            return null;
        }
        // not null return we have root value mil gayi
        if(left!=null && right!=null)
        {
            return root;
        }
        // if left != null return left else return right
        if(left!=null)
        {
            return left;
        }
            return right;
        
    }
}

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
