class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            for(int j=0;j<operations[i].length();j++)
            {
                if(operations[i].charAt(j)=='-')
                {
                     count--;
                     break;
                }
                else if(operations[i].charAt(j)=='+')
                {
                   count++;
                   break;
                }
            }
        }
        return count;
    }
}