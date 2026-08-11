import java.util.*;
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int x = 0;
        int l = 0;
        HashSet<Integer> gg = new HashSet<>();
        HashSet<Integer> hh = new HashSet<>();
        for(int i: nums1)
        {
            gg.add(i);
        }
        for(int j: nums2)
        {
            hh.add(j);
            if(gg.contains(j))
            {
                x++;
            }
        }
        for(int i : nums1)
        {
            if(hh.contains(i))
            {
                l++;
            }
        }
        int[] arr = {l,x};
        return arr;
    }
}