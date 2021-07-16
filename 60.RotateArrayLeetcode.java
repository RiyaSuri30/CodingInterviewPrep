class Solution {
    public void rotate(int[] nums, int k) {
     // so the way we can work for it is as follows
        
        k = k % nums.length;
        // mode we are taking as the number can be to the limit of the value we are considering like k can be nums.length also that is why
        reverse(nums,0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int low , int high)
    {
        while(low<high)
        {
            int temp = nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}
// https://leetcode.com/problems/rotate-array/
