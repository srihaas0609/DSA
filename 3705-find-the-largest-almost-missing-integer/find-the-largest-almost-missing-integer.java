class Solution {
    public int largestInteger(int[] nums, int k) {
    int[] arr = nums.clone();
  int ans=-1;
      
      Arrays.sort(arr);
      
      for(int i =0;i<arr.length;i++)
      {
     int  count = 0;
        for(int j = 0 ; j<=nums.length-k;j++)
        {
           for(int n = j;n<k+j;n++)
           {
            if(nums[n]==arr[i])
            {
                count=count+1;
                break;
            }
           }

        }
        if(count==1)
        {
            ans=arr[i];
        }

      }
      return ans;

    }
}