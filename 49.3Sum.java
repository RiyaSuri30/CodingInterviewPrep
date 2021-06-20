class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        //this is to sort the array
         Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            //so if repetition exists i is directly incremented
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                //variable initializations
                int low = i+1;
                int high = nums.length-1;
                int sum = 0 - nums[i];
                
                // once we are done what to do next
                
                
                // this is the two sum approach now 
                while(low<high)
                {
                    //b+c = -a 
                    if(nums[low]+nums[high]==sum)
                    {
                        // add the values to the res
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        
                        // here is low < high and low == low+1 low++ so low it does not cause same data set 
                        while(low<high && nums[low]==nums[low+1])low++;
                        // here is low < high and low == high-1 high-- so low it does not cause same data set
                        while(low<high && nums[high]==nums[high-1])high--;
                        
                        
                        // increment low as we went to next higher element
                        low++;
                        // increment high as we went to next higher element
                        high--;
                        
                    }
                    
                    //  if < sum low++
                    else if (nums[low]+nums[high]<sum)
                    {
                        low++;
                    }
                    // else high --;
                    else
                    {
                        high--;
                    }
                }
                
            }
        }
        return res;
    }
}
