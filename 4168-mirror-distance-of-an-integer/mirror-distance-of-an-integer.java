class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int rem=0;
     int sum=0;
        while(temp>0)
        {
          rem=temp%10;
          sum=sum*10+rem;
          temp=temp/10;
        }
    return Math.abs(n-sum);
    }
}