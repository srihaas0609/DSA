class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int res=0;
        for(int i = 1;i<nums.length;i++)
        {
           if(nums[i]==nums[j])
           {
             res=nums[j];
            break;
           }
           else
           {
            j++;
           }
        }
        return res;
    }
}