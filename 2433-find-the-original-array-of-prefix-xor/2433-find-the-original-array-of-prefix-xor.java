class Solution {
    public int[] findArray(int[] pref) 
    {
        int[] gg = new int[pref.length];
        if(pref.length == 1)
        {
             gg[0] = pref[0];
             return gg;
        }
        gg[0] = pref[0];
        for(int i = 1; i < pref.length;i++)
        {
            gg[i] = pref[i]^pref[i-1];
        }
        return gg;
    }
}