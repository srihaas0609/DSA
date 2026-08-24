class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,avg=0,count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int left=0;
        int right = k-1;
        while(right<arr.length-1){
            avg=sum/k;
            if(avg>=threshold)
            {
                count++;
            }
            sum=sum-arr[left];
            left++;

            right++;
            sum=sum+arr[right];
        }
        avg=sum/k;
            if(avg>=threshold)
            {
                count++;
            }
        return count;
    }
}