class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int uu = 0;
        int maxx = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                uu = 0;
                boolean valid = true;

                for (int k = i; k <= j; k++) {

                    // Every element must be <= threshold
                    if (nums[k] > threshold) {
                        valid = false;
                        break;
                    }

                    // First element must be even
                    if (k == i && nums[k] % 2 != 0) {
                        valid = false;
                        break;
                    }

                    // Adjacent elements must have different parity
                    if (k > i && nums[k] % 2 == nums[k - 1] % 2) {
                        valid = false;
                        break;
                    }

                    uu++;
                }

                if (valid) {
                    maxx = Math.max(uu, maxx);
                }
            }
        }

        return maxx;
    }
}

// class Solution {
//     public int longestAlternatingSubarray(int[] nums, int threshold) {
//         int uu =0;
//         int maxx = 0;
        
//      for(int i = 0; i < nums.length;i++)
//         {
//             for(int j = i; j < nums.length  ;j++)
//             {
//                 uu = 0;
//                 for(int k = i; k <= j; k++)
//                     {
//                         boolean gg = false;
//                         if(nums[k] <= threshold )
//                         {
//                             if(nums[k] % 2 == 0)
//                             {
//                                 uu++;   
//                                 gg = true; 
//                             }
//                         }
//                         if(k+1 <= nums.length-1)
//                         {
//                             if(nums[k+1] <= threshold && gg)
//                             {
//                                 if(nums[k+1] % 2 != 0)
//                                 {
//                                     uu++;
                                    
//                                 }
//                             }
//                         }
//                     }
//                maxx = Math.max(uu,maxx);

//             }
//         }
//     return maxx;
//     }
// }