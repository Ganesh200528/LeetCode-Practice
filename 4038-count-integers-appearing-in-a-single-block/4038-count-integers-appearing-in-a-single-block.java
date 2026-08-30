class Solution {
    public int countSpecialIntegers(int[] nums) {

        int[] blocks = new int[101];
            int yy = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                blocks[nums[i]] += 1;
            }
        }

        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (blocks[i] == 1) {
                count++;
            }
        }

        return count;
    }
}
        

















//         HashMap<Integer,Integer> hh = new HashMap<>();
//         for(int i = 0; i < nums.length;i++)
//         {
//             hh.put(nums[i],hh.getOrDefault(nums[i],0)+1);
//         }
//         int j = 0;
//         if(nums.length == 1)
//         {
//             return 1;
//         }
//         int gg = 0;
//        while(gg < nums.length)
//        {
//           nums[gg] == nums[gg+1]
//        } 
//        for(int i :hh.keySet())
//        {
//         if(hh.get(i) == 1)
//         {
//             j++;
//         }
//        }
//        return j;
//     }
// }