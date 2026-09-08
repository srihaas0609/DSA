class Solution {
    public int countCommas(int n) {
        int length=0;
        int temp=n;
        int coomas=0;
        int res=0;
        while(temp>0)
        {
            temp=temp/10;
            length++;
            
        }
        if(length<=3)
        {
            coomas=0;
        }
        else
        {
        
        coomas=n-1000+1;

      }
      return coomas;
        
    }
}