class Solution {
    public long sumAndMultiply(int n) {
       String s = String.valueOf(n);
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)!='0')
        {
            sb.append(s.charAt(i));
        }
       }
       if(sb.length()==0)
       {
        return 0;
       }
       else
       {
      long ans = Long.parseLong(sb.toString());
       long rem=0;
       long sum=0;
       long temp=ans;

       while(temp>0)
       {
         rem=temp%10;
         sum=sum+rem;
         temp=temp/10;
       }
       return sum*ans;
       }
        
    }
}