class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int uu = image.length;
        int[][] gg = new int[uu][uu];
        String[] gk = new String[uu];
        for(int i = 0; i < uu;i++)
        {
            StringBuilder ss = new StringBuilder();
            for(int j = 0 ; j < uu; j++)
            {
                ss.append((char)(image[i][j] + '0'));
            }
            gk[i] = ss.reverse().toString();
        }

        for(int k =0 ; k < uu;k++)
        {
            int ee = 0;
            for(char rr : gk[k].toCharArray())
            {
                gg[k][ee] = 1 - (rr -'0');
                ee++;
            }
        }
        return gg;

    }
}