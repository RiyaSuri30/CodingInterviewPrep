// to find the first and last index in the array
class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        
        // so let us see how do we work for the finding of the value
        
       int start = 0;
       int end = nums.length-1;
        int res1 = -1;
        int res2 = -1;
        while(start<=end)
        {
          int mid = start + (end-start)/2;
          
        // now what we do is as follows
            if(nums[mid]==target)
            {
                res1   = mid;
                end = mid-1;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }
        }
        
        //the next thing that we do is as follows:
        start = 0;
        end = nums.length-1;
        while(start<=end)
        {
          int mid = start + (end-start)/2;
          
        // now what we do is as follows
            if(nums[mid]==target)
            {
                res2   = mid;
                start = mid+1;
            }
            else if(nums[mid]<target)
            {
                start = mid+1;
            }
            else
            {
                end = mid - 1;
            }
        }
        int[] arr = new int[2];
        arr[0]= res1;
        arr[1]=res2;
        return arr;
        
        
        
        
        
        
    }
}
/// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
