class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] gg = new int[points.length];
        for(int i = 0; i < points.length;i++)
        {
            gg[i] = points[i][0];
        }
        Arrays.sort(gg);
        int maxx = 0;
        for(int j = 1; j < points.length;j++)
        {
            maxx = Math.max(maxx,gg[j]-gg[j-1]);
        }
        return maxx;
    }
}