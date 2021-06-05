class Solution {
    public int trailingZeroes(int n) {
        // the question is to find the number of trailing zeroes
        int count = 0;
        for(int i = 5; n/i>=1;i=i*5)
        {
            count = count + n/i;
        }
        return count;
    }
}
