import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> hh = new HashSet<>();           HashMap<Integer,Integer> gg = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i < n; i++)
        {
            gg.put(arr[i],gg.getOrDefault(arr[i],0)+1);

        }
        for(int j : gg.values())
        {
            if(hh.contains(j))
            {
                return false;
            }
            else
            {
                hh.add(j);
            }
        }
        return true;
    }
}