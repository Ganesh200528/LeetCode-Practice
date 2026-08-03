import java.util.*;
class Solution
 {


    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> gan = new HashMap<>();
        for(int i = 0; i < nums.length;i++)
        {
            int kk = nums[i];
        
           gan.put(kk,gan.getOrDefault(kk,0)+1);
        }
        int maxx = 0;
        int answer = 0;
        for(int jj : gan.keySet())
        {
           if(gan.get(jj) > maxx)
           {
            maxx = gan.get(jj);
             answer = jj;
           }
        
        }
        return answer;
    }
}