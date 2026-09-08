class Solution {
    public int minOperations(int[] nums) {
        int zz = 0;

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] == 0) {
                zz++;

                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
            }
        }

        // Check the last two elements
        if (nums[nums.length - 2] == 1 &&
            nums[nums.length - 1] == 1) {
            return zz;
        }

        return -1;
    }
}




















// class Solution {
//     public int minOperations(int[] nums) {
//         int zz = 0;
//           for(int i = 0; i < nums.length-2;i++)
//           {
//              if(nums[i] == 0)
//              {
//                 zz++;
//                 nums[i] = 1 - nums[i];
//                 nums[i+1] = 1 - nums[i+1];
//                 nums[i+2] = 1 - nums[i+2];
//              }
//              boolean nn = true;
//             for(int j : nums)
//             {

//                 if(j != 1)
//              {
//                      nn = false;
//                      break;
//              }
//              }
//              if(nn)
//              {
//                 return zz;
//              }
//           }
//           return -1;
//     }
// }