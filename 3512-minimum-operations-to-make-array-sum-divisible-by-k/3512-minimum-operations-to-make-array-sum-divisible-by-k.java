class Solution {
    public int minOperations(int[] nums, int k) {
        int kk = 0;
        for(int j : nums)
        {
            kk += j;
        }
        return kk % k;
        
    }
}