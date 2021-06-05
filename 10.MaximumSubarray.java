class Solution {
    public int maxSubArray(int[] nums) {
        
        //this is based on the Kadane Algorithm 
        // this algorithm is specific to finding maximum sub array
        
        
        
        int maxendinghere = nums[0];
        int maxsofar = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxendinghere = Math.max(maxendinghere+nums[i],nums[i]);
            maxsofar = Math.max(maxendinghere,maxsofar);
        }
        return maxsofar;
    }
}
