class Solution {
    public int reverseDegree(String s) {
      


    int sum=0;
    for(int i=0;i<s.length();i++)
    {

     char ch = s.charAt(i);
      int val = 26 - (ch - 'a');
       int pro=(i+1)*val;
       sum=sum+pro;
    }
    return sum;
    }
}