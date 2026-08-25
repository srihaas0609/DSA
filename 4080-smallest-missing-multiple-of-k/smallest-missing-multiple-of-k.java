class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        int sum=0;
        int i=1;
        while(true)
        {
            sum=i*k;
            if(l.contains(sum))
            {
                i++;
            }
            else
            {
                return sum;
            }
            
        }
    }
}