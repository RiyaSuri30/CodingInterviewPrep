class Solution {
    public int[] plusOne(int[] digits) {
        // so we will start from the end 
        int count =0;
        int[] new_arr = new int[digits.length+1];
        for(int i = digits.length-1;i>=0;i--)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
                count ++;
                
            }
            else
            {
                digits[i]=digits[i]+1;
                break;
            }
        }
        // if suppose the number is 999
        if(count == digits.length)
        {
            new_arr[0]=1;
            return new_arr;
        }
        return digits;
        
    }
}
