/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] finale = new int [m+n];
        //so the way we work here is as follows
        
        int i=0;
        int j=0;
        int k =0;
        while(i<m && j <n)
        {
            if(nums1[i]<=nums2[j])
            {
                finale[k] = nums1[i];
                i++;
                k++;
            }
            else
            {
                finale[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            finale[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            finale[k]=nums2[j];
            j++;
            k++;
        }
        
        for(int l=0;l<nums1.length;l++)
        {
            nums1[l]=finale[l];
        }
    }
}*/


// the above is the naive approach that we have for the coding to be done 
// lets see the better approach to the solution to code it 

// https://www.youtube.com/watch?v=C4oBXLr3zos
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        
        //so the way we work is as follows
        while(p2>=0)
        {
            if(p1>=0 && nums1[p1]>=nums2[p2])
            {
                nums1[i--]=nums1[p1--];
            }
            else
            {
                nums1[i--]=nums2[p2--];
            }
        }
    }
}
