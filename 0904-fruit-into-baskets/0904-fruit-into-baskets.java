import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> gg = new HashMap<>();
        int n = fruits.length;
        int k = 2;
        int l = 0;
        int ans = 0;
        for(int r = 0; r < n;r++)
        {
            gg.put(fruits[r], gg.getOrDefault(fruits[r], 0) + 1);   
            
            if(gg.size() > k )
            {
               gg.put(fruits[l],gg.get(fruits[l])-1);

               if(gg.get(fruits[l]) == 0)
               {
                    gg.remove(fruits[l]);
               }
               l++;
            }
            
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
 