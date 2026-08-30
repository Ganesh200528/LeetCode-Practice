class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int ans = 0;

        for (int jk = 0; jk < nums.size(); jk++) {

            String binaryString = Integer.toBinaryString(jk);

            int j = 0;
            boolean exceeded = false;

            for (int i = 0; i < binaryString.length(); i++) {

                if (binaryString.charAt(i) == '1') {
                    j++;

                    if (j > k) {
                        exceeded = true;
                        break;
                    }
                }
            }

            if (j == k && !exceeded) {
                ans += nums.get(jk);
            }
        }

        return ans;
    }
}