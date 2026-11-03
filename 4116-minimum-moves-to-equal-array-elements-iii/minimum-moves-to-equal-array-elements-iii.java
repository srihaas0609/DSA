class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int count=0;
       for(int i=0;i<nums.length;i++)
       {
        if(max<nums[i])
        {
            max=nums[i];
        }
       } 
       for(int i=0;i<nums.length;i++ )
       {
        if(nums[i]==max)
        {
            continue;
        }
        else
        {
            int ans = Math.abs(max-nums[i]);
            count=count+ans;
        }
       }
       return count;
    }
}