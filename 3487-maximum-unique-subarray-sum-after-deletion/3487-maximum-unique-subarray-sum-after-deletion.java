import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        int maxNegative = Integer.MIN_VALUE;

        for (int num : nums) {
         
            if (num < 0) {
                maxNegative = Math.max(maxNegative, num);
            }

            if (num >= 0 && !set.contains(num)) {
                set.add(num);
                sum += num;
            }
        }

        
        if (set.isEmpty()) {
            return maxNegative;
        }

        return sum;
    }
}