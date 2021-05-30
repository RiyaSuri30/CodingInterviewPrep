class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> val = new ArrayList<>();
        if(arr.length==0)
        {
            return val;
        }
        if(arr.length==1)
        {
            val.add(arr[0]);
            return val;
        }
        int max = arr[arr.length-1];
        val.add(max);
        for(int i = arr.length-2; i>=0;i--)
        {
           if(arr[i]>=max)
           {
               max = arr[i];
               val.add(max);
           }
        }
        Collections.reverse(val);
        return val;
    }
}
