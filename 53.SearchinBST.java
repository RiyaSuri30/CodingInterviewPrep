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
    public TreeNode searchBST(TreeNode root, int val) {
        // edge case consideration for the facts 
        if(root == null)
        {
            return null;
        }
        // if data is equal to val then this is the way we considered it.
        if(root.val == val)
        {
            return root;
        }
        // if greater than val then this is the way we consider it.
        else if (root.val > val)
        {
            return searchBST(root.left,val);
        }
        // if smaller than val then this is the way we consider it.
        else if(root.val<val)
        {
            return searchBST(root.right,val);
        }
        return null;
    }
}

// https://leetcode.com/problems/search-in-a-binary-search-tree/
