class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        int j=0;
        for(int key : mp.keySet())
        {
            if(mp.get(key)==2)
            {
                arr[j]=key;
                j++;
                if(j==2)
                {
                    break;
                }
            }
        }
        return arr;
    }
}