class Solution {
    public int singleNumber(int[] nums) {
      // one approach for the problem is use hashmap and put all th numbers in it
        // once we have put the numbers check whose count is 1
        // return that
        
        //the next famous approach is bit manipulation
        // a xor a = 0
        // a xor 0 = a
        
        // as the repeated number appears twice we can make use of the above properties
        int a = nums[0];
        for(int i =1;i<nums.length;i++)
        {
            a = a^nums[i];
        }
        return a;
    }
}
