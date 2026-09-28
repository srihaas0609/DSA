class Solution {
    public String truncateSentence(String s, int k) {
      String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();
      for(int i=0;i<k;i++)
      {
        if(i>0)
        {
        ans.append(" ");
        }
        ans.append(str[i]);
      }
      return ans.toString();
    }
}