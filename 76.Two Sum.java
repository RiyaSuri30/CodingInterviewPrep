class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
    
        // how to solve the two sum problem
        // the way we work is as follows
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        // Here we have used the concept of hashmap 
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0 ;i < nums.length; i++)
        {
        
            int complement = target - nums[i];
            // if the complement alreay exists then no need to worry just go ahead with the code 
            if(hashmap.containsKey(complement))
            {
                // result that can be stored in the res as the containsKey value
                res[0] = i;
                res[1] = hashmap.get(complement);
            
            }
            // if it is not there later just put it into the hashmap and check the values that we have for the same.
            hashmap.put(nums[i],i);
        
        }
        return res;
    }
}

// the way we work is  as follows : https://leetcode.com/problems/two-sum/
