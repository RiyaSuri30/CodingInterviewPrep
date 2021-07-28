public class Solution {
    public int solve(int[] A, int B) {
        // the way we can work over here is as follows 
        int n = A.length;
        int m = B;
        boolean[][] t = new boolean [n+1][m+1];
        // now the way we work is as follows

        // Step 1 initialization :
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                // the array size is zero then no matter what i do the result will be false as no wieght can be sufficed from it
                if(i==0)
                {
                    t[i][j]=false;
                }
                // if the array weight is 0 then i can just take no element ever and work then 
                if(j==0)
                {
                    t[i][j]=true;
                }
            }
        }
        // now step 2:

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                // if the Current values is smaller than the required value 
                if(A[i-1]<=j)
                {
                    // either you take it or you dont take it and then work
                t[i][j]= t[i-1][j-A[i-1]] || t[i-1][j];
                }
                else
                {
                    // dont take it
                    t[i][j]=t[i-1][j];
                }
            }
        }
       
        if(t[n][m]==true)
        {
            return 1;
        }
        return 0;



    }
}
// https://www.interviewbit.com/problems/subset-sum-problem/#
