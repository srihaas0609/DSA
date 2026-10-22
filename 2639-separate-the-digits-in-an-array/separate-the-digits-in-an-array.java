class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList <Integer> l = new ArrayList<>();
         for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            int rem=0;
            ArrayList <Integer> l1 = new ArrayList<>();
           while(temp>0)
           {

              rem=temp%10;
              l1.add(rem);
              temp=temp/10;
           }
           Collections.reverse(l1);
          l.addAll(l1);
        }
        int[] arr = new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            arr[i]=l.get(i);
        }
        return arr;

        
    }
}