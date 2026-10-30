class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {   sum1=sum1+nums[i];
            int temp=nums[i];
            int rem=0;
            int sum=0;
            while(temp>0)
            {
             rem=temp%10;
             sum=sum+rem;
             temp=temp/10;
            }
            sum2=sum2+sum;
        }
        return Math.abs(sum1-sum2);
    }
}