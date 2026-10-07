class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[(2*nums.length)];
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            arr[n+i]=nums[n-i-1];
        }
        return arr;
    }
}