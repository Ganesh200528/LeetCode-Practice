class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int rowMax = 0;
                int colMax = 0;

                // Find maximum in row
                for (int k = 0; k < n; k++) {
                    rowMax = Math.max(rowMax, grid[i][k]);
                }

                // Find maximum in column
                for (int k = 0; k < n; k++) {
                    colMax = Math.max(colMax, grid[k][j]);
                }

                int newHeight = Math.min(rowMax, colMax);

                ans += newHeight - grid[i][j];
            }
        }

        return ans;
    }
}












// class Solution
// {
//     public int maxIncreaseKeepingSkyline(int[][] grid) 
//     {
//         int n = grid.length;
//         int[] rowMax = new int[n];
//         int[] colMax = new int[n];

//         for(int i = 0; i < n;i++)
//         {
//             for(int j = 0; j < n;j++)
//             {
//                 rowMax[i] = Math.max(rowMax[i],grid[i][j]);
//             }
//         }

//         for(int j = 0; j < n;j++)
//         {
//             for(int i = 0; i < n;i++)
//             {
//                 colMax[j] = Math.max(colMax[j],grid[i][j]);
//             }
//         }

//         int ans = 0;


//         for(int i = 0; i < n;i++)
//         {
//             for(int j = 0; j < n;j++)
//             {
//                 int newHeight = Math.min(rowMax[i],colMax[j]);

//                 ans += newHeight - grid[i][j];
//             }
//         }
//         return ans;
//     }

// }
















// class Solution {
//     public int maxIncreaseKeepingSkyline(int[][] grid) 
//     {
//         int ans = 0;
//         int gg = 0;
        
//         for(int i = 0; i < grid.length;i++)
//         {
//             int maxx = 0;
//             int maxxx = 0;
//             for(int j = 0; j < grid.length;j++)
//             {
//                 if(grid[i][j] > maxx)
//                 {
//                     maxx = grid[i][j];
//                 }
//                 if(grid[j][i] > maxxx)
//                 {
//                     maxxx = grid[j][i];
//                 }
//             }
//             gg = Math.max(maxx,maxxx);
//             ans += gg - grid[i][j]; 
//         }
//         return ans;

//     }
// }