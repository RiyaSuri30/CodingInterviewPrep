class Solution {
    public int missingNumber(int[] nums) 
    {
     
        // even this is a great bitwise math question that we have
        
        
        
        int missing = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            missing = missing ^ i ^ nums[i];
        }
        return missing;
    }
}
