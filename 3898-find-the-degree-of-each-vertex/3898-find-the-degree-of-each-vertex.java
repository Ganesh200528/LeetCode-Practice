class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int nn = matrix[0].length;
        int[] gg = new int[n];
        int temp = 0;
        for(int i = 0 ; i < n;i++)
        {
            for(int j = 0; j < nn;j++)
            {
                if(matrix[i][j] == 1)
                {
                    temp++;
                }

            }
            gg[i] = temp;
            temp = 0;
        }
        return gg;
    }
}