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
    public TreeNode sortedArrayToBST(int[] nums) {
        // so the way we work is as follows
        
        
        // if nums.length == 0 then we dont do anyth
        if(nums.length==0)
        {
            return null;
        }
        
        
        // the way we work is as follows take the sorted array we have 
        TreeNode val = sorted(nums,0,nums.length-1);
        
        return val;
    }
    
    
    public TreeNode sorted(int[] nums,int start,int end)
    {
        // this becomes the stopping condition that (start > end) so we stop
        if(start>end)
        {
            return null;
        }
        // mid is represented so we need to take the addition of the of the start and end and work for it 
        int mid = (start+end)/2;
        // we create a TreeNode 
        TreeNode node = new TreeNode(nums[mid]);
        // run recursion for the left 
        node.left = sorted(nums,start,mid-1);
        // run recusrion to right 
        node.right = sorted(nums,mid+1,end);
        return node;
    }
}
