class Solution
{
    public boolean isPalindrome(String s)
    {
        s = s.toLowerCase();
        String t = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9' )
            {
                t= t + Character.toString(s.charAt(i));
            }
        }
         
      //  System.out.println(s);
       // System.out.println(t);
        for(int i=0;i<t.length()/2;i++)
        {
            if(t.charAt(i)!=t.charAt(t.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
