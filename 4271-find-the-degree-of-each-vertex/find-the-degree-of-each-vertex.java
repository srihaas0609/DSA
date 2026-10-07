class Solution {
    public int[] findDegrees(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        
       for(int i=0;i<matrix.length;i++)
       {
        int c1=0;
        for(int j=0;j<matrix[i].length;j++)
        {
            if(matrix[i][j]==1)
            {
                c1++;
            }
        }
        l.add(c1);
       } 
       int []arr = new int[l.size()];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=l.get(i);
       }
       return arr;
    }
}