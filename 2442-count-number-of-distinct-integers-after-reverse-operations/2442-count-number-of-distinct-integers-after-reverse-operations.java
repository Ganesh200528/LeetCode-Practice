class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hh = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hh.add(nums[i]);

            int n = nums[i];
            int rev = 0;

            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }

            hh.add(rev);
        }

        return hh.size();
    }
}










// / class Solution {
//     public int countDistinctIntegers(int[] nums) 
//     {
        
//         HashSet<Integer> hh = new HashSet<>();
//         for(int i = 0; i < nums.length;i++)
//         {
//             hh.add(nums[i]);
//             StringBuilder ss = new StringBuilder();
//             String kk = String.valueOf(nums[i]);
//             ss.append(nums[i]);
//             ss.reverse();
//             hh.add(Integer.parseInt(ss.toString()));
//         }
       
//         return hh.size();
//     }
// }