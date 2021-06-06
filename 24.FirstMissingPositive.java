class Solution 
{
    public int firstMissingPositive(int[] nums)
    {
        // this is indeed a great question on hard level and the way to solve it can be understood as follows
        
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int correctPos = nums[i]-1;
            while(1<=nums[i] && nums[i]<=n && nums[i]!=nums[correctPos])
            {
                int temp = nums[i];
                nums[i]=nums[correctPos];
                nums[correctPos]=temp;
                correctPos  = nums[i]-1;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return nums.length+1;
    }
}
