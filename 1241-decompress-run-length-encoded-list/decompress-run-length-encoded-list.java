class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int j=1;
        int i=0;
       while(j<nums.length)
        {
           int temp2=nums[j];
           int temp1=nums[i];
           int k=0;
           while(k<temp1)
           {
            list.add(temp2);
            k++;
           }
           j=j+2;
           i=i+2;
        }
        int[] arr = new int[list.size()];
        for(int k=0;k<arr.length;k++)
        {
             arr[k]=list.get(k);
        }
        return arr;
    }
}