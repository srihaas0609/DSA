class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []left = new int[nums.length];
        int []right = new int[nums.length];
         left[0]=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        for(int i = 1 ;i<left.length;i++)
        {
            left[i]=left[i-1]+nums[i-1];
        }
        right[right.length-1]=0;
        
        for(int i=right.length-2;i>=0;i--)
        {
           right[i]=nums[i+1]+right[i+1];
        }
        int i=0;
        int j=0;
        while(i<left.length && j<right.length)
       {
             nums[i]=Math.abs(left[i]-right[j]);
             i++;
             j++;
       }
           return nums;
    }
}