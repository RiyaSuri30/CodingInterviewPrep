class Solution {
    public int minDistance(String word1, String word2) {
        //so here we wan to check how many modifications we need to make in order to make the changes as follow
        
        // if we consider the length of the word1 and the word2 to be zero then this is how we work for it 
        if(word1.length()==0 && word2.length()==0)
        {
            return 0;
        }
        
        // if one of the string is 0 and other is non zero then return word2.length
        if(word1.length() ==0 && word2.length()!=0)
        {
            return word2.length();
        }
        
        // if word1 is not 0 then return that 
        if(word2.length()==0 && word1.length()!=0)
        {
            return word1.length();
        }
        
        // store the value of the word1 and word 2 length in the variable m and n
        int m = word1.length();
        int n = word2.length();
        // now otherwise we will create a 2d dp array
        int[][]dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                // i ==0 means empty hai so this is how it works
                if(i==0)
                {
                    dp[i][j]=j;
                }
                // j 0 hai so that is how we workd
                if(j==0)
                {
                    dp[i][j]=i;
                }
            }
        }
        
        // this becomes the initialisation that we have
        
        for(int i =1 ; i<=m ; i++)
        {
            for(int j =1 ; j<=n ; j++)
            {
               
                // now we can consider the (i-1) and (j-1) then take diagonal
            if(word1.charAt(i-1)==word2.charAt(j-1))
            {
                dp[i][j] = dp[i-1][j-1];
            }
            
            //now the way we work is as follows
            else
            {
                // otherwise we find the min of all the three 
                dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]);
            }
                
            }
        }
        
        // return dp[m][n]
        return dp[m][n];
        
        
    }
}
// https://leetcode.com/problems/edit-distance/
