class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l =new ArrayList<>();
        int n= extraCandies;
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }
         for(int i=0;i<candies.length;i++)
        {
           if((candies[i]+n)>=max)
           {
            l.add(true);
           }
           else
           {
            l.add(false);
           }
        }
        return l;
    }
}