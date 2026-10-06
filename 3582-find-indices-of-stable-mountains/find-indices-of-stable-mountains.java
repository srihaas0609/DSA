class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<height.length;i++)
        {
            int temp = height[i-1];
            if(temp>threshold)
            {
            l.add(i);
            }
        }
        return l;
    }
}