class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int ans=-1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if(sum%k==0)
        {
            ans=0;
        }
        else
        {
        for(int i =0;i<nums.length;i++)
        {
            
            while(nums[i]>0)
            {
                nums[i]--;
                sum--;
                count++;
                if(sum%k==0)
                {
                    ans=count;
                    return ans;
                }
            }
            
        }
        }
        return ans;
    
    }
}