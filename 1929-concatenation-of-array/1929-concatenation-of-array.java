import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] gg = new int[2*n];
        for(int i = 0; i < n; i++)
        {
            gg[i]=gg[i+n]=nums[i];
        }
        return gg;
    }
}