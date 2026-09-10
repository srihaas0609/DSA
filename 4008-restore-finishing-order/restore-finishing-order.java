class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> l = new ArrayList<>();
        int a[]=new int[friends.length];
        for(int i =0;i < friends.length;i++)
        {
            l.add(friends[i]);
        }
        int j=0;
        for(int i=0;i<order.length;i++)
        {
            
            if(l.contains(order[i]))
            {
               
              a[j]=order[i];
              j++;
            }
        }
        return a;

    }
}