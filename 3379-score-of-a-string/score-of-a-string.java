class Solution {
    public int scoreOfString(String s) {
        int  totalsum =0;
        int j =0;
        for(int i = 1; i<s.length();i++)
        {
          int sum1 = s.charAt(i);
          int sum2 = s.charAt(j);
          int sum = Math.abs(sum1-sum2);
            totalsum=sum+totalsum;
            j++;
        }
        return totalsum;

    }
}