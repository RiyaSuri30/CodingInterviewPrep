class Solution {
    public int findDuplicate(int[] nums) {
        // approaches to solve this problem are as follows.
        
        // the one way to do this would be as follows is to have a sorted array in nature and work for it.
        
        
        int hare = nums[0];
        int tortoise = nums[0];
        do
        {
            hare = nums[hare];
            tortoise = nums[nums[tortoise]];
            
        }while(hare!=tortoise); // intersection
        
        
        // now to find the start
        tortoise = nums[0];
        while(tortoise!=hare)
        {
           hare = nums[hare];
           tortoise = nums[tortoise]; 
        }
        
        return hare;
        
        
    }
}
