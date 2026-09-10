class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                left.add(nums[i]);
            }
            else if(nums[i]==pivot)
            {
                equal.add(nums[i]);
            }
            else
            {
                right.add(nums[i]);
            }
        }
        left.addAll(equal);
        left.addAll(right);
        for(int i=0;i<left.size();i++)
        {
            nums[i]=left.get(i);
        }
        return nums;
    }
}