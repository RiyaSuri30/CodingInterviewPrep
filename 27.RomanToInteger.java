class Solution {
    public int romanToInt(String s) {
        // so the working is very simple in this case
        /* We first make a hashmap of character and integer and put in all the values */
        HashMap <Character,Integer> hashmap = new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        
        // so the way we work now is as follows
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
         
            if(i>0 && hashmap.get(s.charAt(i))>hashmap.get(s.charAt(i-1)))
            {
                result = result + hashmap.get(s.charAt(i)) - 2*hashmap.get(s.charAt(i-1));
            }
            
            else
            {
                result=result+hashmap.get(s.charAt(i));
            }
        
        }
        
        return result;
        
    }
}
