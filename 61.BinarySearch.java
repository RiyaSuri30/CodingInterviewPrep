class Solution {
    public int search(int[] nums, int target) {
        // so how does binary search work 
        int low = 0;
        int end = nums.length -1;
        while(low<=end)
        {
            int mid = (low + end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
            
        }
        return -1;
    }
}
// https://leetcode.com/problems/binary-search/
