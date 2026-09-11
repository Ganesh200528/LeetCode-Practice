class Solution {
    public int[] sumZero(int n) {
         int[] bb = new int[n];
        ArrayList<Integer> aa = new ArrayList<>();
        boolean gk = false;
        if(n % 2 != 0)
        {
        aa.add(0);
        gk = true;
        }
        for(int i = 1 ; i < (n/2)+1 ;i++)
        {
            
            aa.add(i);
            if(i+1 < n && gk)
            {
            aa.add(0-i);
            }
            if(i+1 <= n && !gk)
            {
            aa.add(0-i);
            }
           
        }
        int k = 0;
        for(int gg : aa)
        {
            bb[k] = gg;
            k++;
        }
        return bb;
    }
}