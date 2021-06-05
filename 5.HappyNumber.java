class Solution {
    public boolean isHappy(int n)
    {
        // here what we are going to do is as follows
        int slow = next(n);
        int fast = next(next(n));
        while(slow!=fast)
        {
            slow = next(slow);
            fast = next(next(fast));
        }
        return slow == 1;
    }
    
    public int next (int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum = sum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
}
