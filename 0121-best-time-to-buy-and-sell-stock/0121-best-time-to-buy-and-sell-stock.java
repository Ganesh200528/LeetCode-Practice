class Solution {
    public int maxProfit(int[] prices) {

        int minn = Integer.MAX_VALUE;
        int maxx = 0;

        for (int i = 0; i < prices.length; i++) {

            minn = Math.min(minn, prices[i]);

            maxx = Math.max(maxx, prices[i] - minn);
        }

        return maxx;
    }
}