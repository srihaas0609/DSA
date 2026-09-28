class Solution {
    public int balancedStringSplit(String s) {
       int c1=0;
       int c2=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='L')
        {
            c1++;
        }
        else
        {
            c1--;
        }
        if(c1==0)
        {
            c2++;
        }
      }
      return c2;  
    }
}