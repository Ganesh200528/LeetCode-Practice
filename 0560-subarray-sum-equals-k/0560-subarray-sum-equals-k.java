class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
























// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int ans = 0;
//         int gg =0;
//         for(int i = 0; i < nums.length;i++)
//         {
//             for(int j = i; j < nums.length;j++)
//             {
//                 for(int kk = i; kk <= j ;kk++)
//                 {
//                     ans += nums[kk];
                    
//                 }
//                 if(ans == k)
//                 {
//                     gg++;
                    
//                 }
//                 ans = 0;
//             }
//         }
//         return gg;
//     }
// }