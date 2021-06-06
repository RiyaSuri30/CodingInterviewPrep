class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        if(nums.length==0)
        {
            return ;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
               nums[pointer]=nums[i];    
               pointer = pointer + 1 ;  
            }
              
        }
        
        for(int j=pointer;j<nums.length;j++)
        {
            nums[j]=0;
        }
        
        return;
    }
}
