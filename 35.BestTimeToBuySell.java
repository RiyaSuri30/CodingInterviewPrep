class Solution 
{
    public int maxProfit(int[] prices)
    {
        int min = Integer.MAX_VALUE; // this will help in finding the minimum element.
        
        int profit = 0; // this will showcase the profit being made.
        
        // the way it works is as follows
      
      // here we can just look one way at a time so the way we work as follows 
        for(int i=0;i<prices.length;i++)
        {
                min = Math.min(min,prices[i]);
                profit = Math.max(profit,prices[i]-min);
        }
        
        return profit;
        
    }
}
