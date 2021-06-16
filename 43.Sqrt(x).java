class Solution {
    public int mySqrt(int x) {
        
        // the way to find the square root of the number
        
           //so the way we work is as follows
        
        long left = 2;
        long right = x/2;
        long mid;
         if(x<2)
            {
                return x;
            }
        while(left <= right)
        {
             mid = (left)+((right-left)/2);
            // what we can do is check whether number is smaller than 2 then just return
           
            // if it is equal then just return mid
            if(mid*mid == x)
            {
                return (int)mid;
            }
            // if greater then delete the right part
            else if(mid*mid>x)
            {
                right=mid-1;
            }
            //if smaller delete the left part
            else if(mid*mid<x)
            {
                left = mid+1;
            }
        }
        // if nothing happens return the smallest part that we have
        return (int)left -1;

    }
}
