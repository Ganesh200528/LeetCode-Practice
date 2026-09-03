class Solution {
    public int maxDistance(int[] colors) {
        
        
        int jj = colors.length-1;
        int i = 0;
        int xx = 0;
        int yy = 0;
        while(i < jj)
        {
            if(colors[i] != colors[jj])
            {
               xx = Math.abs(jj - i);
               break;
            }
            jj--;
        }
        i = 0;
        jj = colors.length -1;
        while(i < jj)
        {

            if(colors[i] != colors[jj])
            {
               yy = Math.abs(jj - i);
               break;
            }
            i++;
        }

        yy = Math.max(yy,xx);
        
        return yy;
    }
}