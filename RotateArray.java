/*package whatever //do not write package name here */

//RotateArray.java name is given just to identify the problem u will have to change the class name 


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int d = sc.nextInt();
		    int[] nums = new int[n];
		    for(int i=0;i<nums.length;i++)
		    {
		        nums[i]=sc.nextInt();
		    }
		    //print 
		    if(d==0)
		    {
		       for(int i=0;i<nums.length;i++)
		    {
		        System.out.print(nums[i]+" ");
		    }
		    System.out.println();
		    return;
		    }
		    
		    reverse(nums,0,d-1);
		    reverse(nums,d,nums.length-1);
		    reverse(nums,0,nums.length-1);
		    
		         for(int i=0;i<nums.length;i++)
		    {
		        System.out.print(nums[i]+" ");
		    }
		    System.out.println();
		
		}
		    return;
	}
	public static void reverse(int[] nums,int low,int high)
	{
	    while(low<high)
	    {
	        int temp =nums[low];
	        nums[low]=nums[high];
	        nums[high]=temp;
	        low++;
	        high--;
	    }
	}
}
