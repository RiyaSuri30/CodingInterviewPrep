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
    int preindex = 0;
    HashMap<Integer,Integer> hashmap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        for(int i=0;i<inorder.length;i++)
        {
            hashmap.put(inorder[i],i);
        }
        return buildTree(inorder,preorder,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] inorder, int[] preorder,int start, int  end)
    {
        if(start > end)
        {
            return null ; // what this symbolises is that we have surpassed the leaf node work
        }
        
        // now we talk about the Node construction
        TreeNode root = new TreeNode(preorder[preindex++]); // make node 
        int index = hashmap.get(root.val); // get index from inorder
        root.left = buildTree(inorder,preorder,start,index-1); //chk left
        root.right = buildTree(inorder,preorder,index+1,end); // chk right
        
        return root;
    }
}
