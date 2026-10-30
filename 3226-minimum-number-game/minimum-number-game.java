class Solution {
public int[] numberGame(int[] nums) {
    ArrayList<Integer> l = new ArrayList<>();
    ArrayList<Integer> l1 = new ArrayList<>();
    for(int i=0;i<nums.length;i++)
    {
        l.add(nums[i]);
    }
    while(l.size()>0)
    {
        int r1 = Collections.min(l);
    l.remove(Integer.valueOf(r1));
    int r2 = Collections.min(l);
    l.remove(Integer.valueOf(r2));
        l1.add(r2);
        l1.add(r1);

    }
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=l1.get(i);
    }
    return nums;
        
    }
}