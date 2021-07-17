class Solution {
    public int rob(int[] nums) {
        // so how does the house robbers problem work
        int n = nums.length;
        int[] dp = new int[nums.length+1];
        
        for(int i=0;i<dp.length;i++)
        {
            if(i==0)
            {
              dp[i]=0;  
            }
            else if(i==1)
            {
                dp[i]=nums[i-1];
            }
           else if(i==2)
            {
                dp[i]= Math.max(nums[i-1],nums[i-2]);
            }
            else
            {
                dp[i]= Math.max(nums[i-1]+dp[i-2],dp[i-1]);
            }
        }
     return dp[n];    }
}
// https://leetcode.com/problems/house-robber/
