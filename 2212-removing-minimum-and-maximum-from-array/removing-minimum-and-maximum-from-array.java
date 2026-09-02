class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i = 1;i<nums.length;i++)
        {
           if(nums[i]>max)
           {
            max=nums[i];
           }
           if(nums[i]<min)
           {
            min=nums[i];
           }
        }
        int countmax=0;
        int temp1=0;
        int temp2=0;
        int temp3=0;
        int temp4=0;
        int n1=0;
        int n2=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=max)
            {
                temp1=temp1+1;
            }
            else
            {
                break;
            }
        }
       for(int i = nums.length - 1; i >= 0; i--)

        {
              if(nums[i]!=max)
            {
                temp2=temp2+1;
            }
            else
            {
                break;
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=min)
            {
                temp3=temp3+1;
            }
            else
            {
                break;
            }
        }
       for(int i = nums.length - 1; i >= 0; i--)

        {
              if(nums[i]!=min)
            {
                temp4=temp4+1;
            }
            else
            {
                break;
            }
        }
     int option1 = Math.max(temp1, temp3) + 1;
int option2 = Math.max(temp2, temp4) + 1;
int option3 = Math.min(temp1 + temp4 + 2, temp3 + temp2 + 2);

return Math.min(option1, Math.min(option2, option3));
    }
}