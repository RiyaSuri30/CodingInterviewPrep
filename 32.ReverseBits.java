public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
      // so the way we work here is as follows
        int res =  0 // this is the result bit we have for the purpose of storing 
        int dest = 1; // this is the destination bit value that we hvae
        for(int i=31;i>=0;i--)
        {
            int mask = 1<< i;
            if((n & mask) !=0)
            {
                res=res | dest;
            }
            dest = dest<<1;
        }
        return res;
    }
}
