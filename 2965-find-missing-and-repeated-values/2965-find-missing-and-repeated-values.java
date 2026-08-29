class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> aa = new ArrayList<>();
        int uu = 0;
        int xx = 0;
        int jj = grid.length;
       for(int i = 0; i < jj;i++)
       {
        for(int j = 0; j < jj ;j++)
        {
            if(!aa.contains(grid[i][j]))
            {
            aa.add(grid[i][j]);
            }
            else
            {
                uu = grid[i][j];
            }
            
        }
       } 
       for(int i = 1 ; i <= jj*jj;i++)
       {
        if(!aa.contains(i))
        {
            xx = i;
        }
       }
        
        int[] a = {uu,xx};
        return a;
    }
}