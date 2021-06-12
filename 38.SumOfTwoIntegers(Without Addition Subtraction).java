class Solution {
    public int getSum(int a, int b) {
    if(a==0) return b; // if one number is null return the other 
    if(b==0) return a; // if the other number is null return the other 
    while(b!=0)
    {
       int carry = a & b; // to find the carry
       a = a ^ b;  // to set the unequal bits as if the bits are equal 0 0 addition will be 0 and 1 1 will be taken care in carry
       b = carry << 1; // shift carry if 1 1 so for that 
    }
        return a; // return a 
    }
}
