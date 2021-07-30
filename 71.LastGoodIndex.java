class Solution {
    public boolean canJump(int[] nums) {
        // this is a simple linear serach problem that we have 
        
        // we start from the end index and then we check whether we can got the end from there or not 
        
        // so how are we working for it 
        int lastGoodIndex = nums.length-1;
        for(int i= nums.length-1;i>=0;i--)
        {
        
            if(i+nums[i]>= lastGoodIndex)
            {
                lastGoodIndex = i;
            }
        }
       if(lastGoodIndex==0)
       {
           return true;
       }
        return false;
    }
}

// https://leetcode.com/problems/jump-game/
