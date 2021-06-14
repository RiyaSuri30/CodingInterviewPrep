// https://leetcode.com/problems/generate-parentheses/
class Solution
{
    public List<String> generateParenthesis(int n) 
    {
    
        ArrayList<String> res = new ArrayList<String>();
        //so the way we work is as follows
        
        //String res="";
        helper(res,"",0,0,n);
        return res;
    }
    public void helper(ArrayList<String> res , String s , int open , int close, int n)
    {
        if(s.length() == 2*n)
        {
            res.add(s);
            return;
        }
        // now the way it will work out is as follows
        
        
        // now the wroking will happen as follows
        // value of open must be less than n
        if(open < n)
        {
            helper(res,s+"(",open+1,close,n);
        }
        // and value of the close brackets must be smaller than open bracket in every essence 
        if(close < open)
        {
            helper(res,s+")",open,close+1,n);
        }
        
    }
}
