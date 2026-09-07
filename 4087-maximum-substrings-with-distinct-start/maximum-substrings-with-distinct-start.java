class Solution {
    public int maxDistinct(String s) {
        int count=0;
        List<Character> str = new ArrayList<>();
        for(int i = 0 ;i<s.length();i++)
        {
            if(str.contains((s.charAt(i))))
            {
                continue;
            }
            else
            {
                str.add(s.charAt(i));
                count++;
            }
            
        }
        return count;
    }
}