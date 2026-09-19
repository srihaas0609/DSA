class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       ArrayList<Character> l = new ArrayList<>();
       for(int i=0;i<jewels.length();i++)
       {
        l.add(jewels.charAt(i));
       }
       int count=0;
       for(int i=0;i<stones.length();i++)
       {
        if(l.contains(stones.charAt(i)))
        {
         count++;
        }
       }
       return count;
    }
}