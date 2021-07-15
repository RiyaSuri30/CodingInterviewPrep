public class Solution
{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
     
        int count = 0;
        while(n!=0)
        {
            n = n & (n-1);
            count ++;
        }
        return count;
    }
}

// EXPLANATION :
/* 


For understanding the concepts of the working of this algorithm we work as follows
that every number and the number less than that always have the last bits to be opposite in nature and thus that 
that is after the occurrence of the first one all the remaining bits are complement of each other.
so this helps to keep the track of the number of 1 by removing the ones to the end in every single iteration

*/
