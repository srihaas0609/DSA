class Solution {
    public int maxFreqSum(String s) {
        int res1=0;
        int res2=0;
        for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    continue;
                }
                else
                {
                    int count=0;
            for(int j = 0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
                
            }
           res1 =Math.max(res1,count);
            }
        }
         for(int i = 0 ;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            { 
                 int count=0;
            for(int j = 0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
                
            }
           res2 =Math.max(res2,count);
            }
        }
           
        return res1+res2;
        }
    }
