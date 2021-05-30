class Solution {
    public int trap(int[] height)
    {
        
        int[] mxl = new int[height.length];
        int[] mxr = new int[height.length];
        int n = height.length;
        int sum =0;
        if(height.length==0)
        {
            return sum;
        }
        mxl[0]= height[0];
        for(int i =1 ;i<height.length;i++)
        {
            mxl[i]= Math.max(height[i],mxl[i-1]);
        }
        
        mxr[n-1]= height[n-1];
        for(int i =height.length-2 ;i>=0;i--)
        {
            mxr[i]= Math.max(height[i],mxr[i+1]);
        }
        
        for(int i =0;i<n;i++)
        {
            sum = sum + Math.min(mxl[i],mxr[i])-height[i];
        }
        return sum;
    }
}
