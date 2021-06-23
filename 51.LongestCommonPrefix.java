class Solution {
    public String longestCommonPrefix(String[] strs) {
        //so the way it works is as follows
        
        // the logic we use here is as follows we take the index and set that as 0
        // longestcommonprefix is 0
        int index =0;
        
        // we set that as 0
        String longestCommonPrefix ="";
        
        // so if strs is null or length of the set of string is 0 return null
        if(strs==null || strs.length==0)
        {
            // return longestcommonprefix
            return longestCommonPrefix;
        }
        
        // we take the first string for reference and from that 
        for(char c : strs[0].toCharArray())
        {
            // we compare remaining strings
            for(int i=1;i<strs.length;i++)
            {
                // if index > strs[i].length OR value is not same 
                if(index>=strs[i].length() || strs[i].charAt(index)!=c)
                {
                    return longestCommonPrefix;
                }
            }
            //Append it 
            longestCommonPrefix+=c;
            index++;
        }
        
        return longestCommonPrefix;
    }
}
