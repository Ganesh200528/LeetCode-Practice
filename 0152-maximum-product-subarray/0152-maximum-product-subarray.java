class Solution {
    public int maxProduct(int[] nums) {
        long maxx = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            long ans = 1;

            for (int j = i; j < nums.length; j++) {
                ans *= nums[j];
                maxx = Math.max(maxx, ans);
            }
        }

        return (int) maxx;
    }
}