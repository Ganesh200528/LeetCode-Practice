class Solution {
    public int[][] transpose(int[][] matrix) {
        int cl = matrix[0].length;
        int rl = matrix.length;
      
      int[][] result = new int[cl][rl];

      for(int r = 0; r < rl;r++)
      {
        for(int c= 0 ; c < cl; c++)
        {
            result[c][r] = matrix[r][c];
        }
      }
      return result;
    }
}