class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     //apprach 1 can be to use hashmap
     /*   HashMap<Integer,Integer> hashmap = new HashMap<>();
        List<Integer> values = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hashmap.containsKey(nums[i]))
            {
                values.add(nums[i]);
            }
            hashmap.put(nums[i],1);
        }
        return values; */
        
        // the another approach is to go as follows
        
        // THIS IS HOW WE WORK FOR THE VALUES ARRAY
        
        // the approach we followed for this question is as follows
       
        
    //    THE WAY WE WORK IS AS FOLLOWS
            
        List<Integer> values  = new ArrayList<Integer>();
        for(int num : nums )
        {
            // what we do is as follows
            if(nums[Math.abs(num)-1]<0) // means the number is neagtive in nature then what we do is as follows
            {
                values.add(Math.abs(num));
            }
            nums[Math.abs(num)-1]= nums[Math.abs(num)-1]* -1;
            
        }
        // so the way we work is as follows
        return values;
    }
    // so this is O(n) solution that we have 
}
// first approach where is O(n) but space complexity is not inplace

// what can be a better approach in this regard 


// leetcode : https://leetcode.com/problems/find-all-duplicates-in-an-array/
