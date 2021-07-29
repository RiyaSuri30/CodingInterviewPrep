class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        // the naive approach generate all the sub string 
        HashMap<Character,Integer> mpp = new HashMap<Character,Integer>();
        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;
        while(right < n)
        {
            if(mpp.containsKey(s.charAt(right)))
            {
                // here what we are doing is upating the value of the left to the point where we go to the next index where the repeated character was found + 1 so that there is not point in checking the characters in between of it 
                left = Math.max(mpp.get(s.charAt(right))+1,left);
                
            }
            // always put the current right character
            mpp.put(s.charAt(right),right);
            // update the length of the maximum string occurence you get
            len = Math.max(len, right-left+1);
            // then do right ++
            right++;
            
        }
        // then return the length we have 
        return len;
        
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
