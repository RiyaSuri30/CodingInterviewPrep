class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // the way we can work for it is as follows 
        int[] numeric = new int[nums1.length+nums2.length];
        int p1 = 0;
        int p2 = 0;
        int index=0;
        while(p1<nums1.length && p2<nums2.length)
        {
            //now the way we work is as follows
            
            if(nums1[p1]<=nums2[p2])
            {
                numeric[index++]=nums1[p1++];
            }
            else
            {
                numeric[index++]=nums2[p2++];
            }
        }
        
        // now check for the other condition
        while(p1<nums1.length)
        {
            numeric[index++]=nums1[p1++];
        }
        
        while(p2<nums2.length)
        {
            numeric[index++]=nums2[p2++];
        }
        
        if(numeric.length%2!=0)
        {
            return numeric[numeric.length/2];
        }
        return ((double)numeric[(numeric.length/2)-1]+(double)numeric[(numeric.length)/2])/2;
    }
}
