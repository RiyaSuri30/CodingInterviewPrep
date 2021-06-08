class Solution {
    public boolean isPowerOfTwo(int n) {
        // this is concept related to bit manipulation and it works as follows
        //consider the power of 2 -> 2 raised to 0 = 1, 2 raised to 1 = 2 , 2 raised to 2 = 4 so
        // so if we subtract by 1 and perform & of number and number -1 then we get 0
        if(n==0 || n<0)
        {
            return false;
        }
        
       int val = n&(n-1);
        if(val==0)
        {
            return true;
        }
        return false;
    }
}
