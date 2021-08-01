class Solution {
    public int maxProduct(int[] nums) {
        //stores the initial values 
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = nums[0];
        
        //now run a loop from 0 to n 
        for(int i =1 ; i < nums.length; i++)
        {
            // we store the values in temp_max  so that the max_so_far does not change 
            int temp_max = Math.max(nums[i],Math.max(max_so_far*nums[i],min_so_far*nums[i]));
            // we store in min_so_far and calculate the min
         min_so_far = Math.min(nums[i],Math.min(max_so_far*nums[i],min_so_far*nums[i]));
            // max_so_far = temp_max
            max_so_far = temp_max;
            //result can be stored in this
            result = Math.max(max_so_far,result);
        }
        return result;
    }
}
// https://leetcode.com/problems/maximum-product-subarray/
