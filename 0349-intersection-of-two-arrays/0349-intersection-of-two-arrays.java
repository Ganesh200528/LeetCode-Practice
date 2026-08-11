import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> gg = new HashSet<>();
        HashSet<Integer> hh = new HashSet<>();
        for(int i : nums1)
        {
            gg.add(i);
        }
        for(int j : nums2)
        {
            if(gg.contains(j))
            {
                hh.add(j);
            }
        }
        int[] jj = new int[hh.size()];
        int k = 0;
        for(int gv : hh)
        {
            jj[k] = gv;
            k++;
        }
        return jj;
        }

}