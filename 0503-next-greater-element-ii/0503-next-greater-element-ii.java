class Solution
{
    public int[] nextGreaterElements(int[] nums)
    {
        int n = nums.length;
        int[] bb = new int[n];

        for(int j = 0; j < n;j++)
        {
            bb[j] = -1;

            int xx = j+1;

            for(int count = 0; count < n - 1;count++)
            {
                int index = xx % n;
                if(nums[index] > nums[j])
                {
                    bb[j] = nums[index];
                    break;
                }
                xx++;
            }
        }
        return bb;
    }
}


















// class Solution {
//     public int[] nextGreaterElements(int[] nums) 
//     {
//         int maxx = 0;
//         int[] bb = new int[nums.length];
//         int[] newArr = nums.clone();
//         Arrays.sort(newArr);

//         for(int j = 0; j < nums.length-1;j++)
//         {
//             int xx = j+1;
//             if(nums[j] == newArr[nums.length-1])
//             {
//                 bb[j] = -1;
//                 continue;
//             }
//             while(nums[j] > nums[xx] && xx < nums.length-1)
//             {
//                 xx++;
//             }
//             if(xx == nums.length -1 )
//             {
//                 int kk = 0;
//                while(nums[j] >= newArr[kk])
//                {
//                     kk++;
//                }
//                nums[j] = nums[kk];
//             }
//             else
//             {
//                 bb[j] = nums[xx];
//             }
//         }
//         if(nums[nums.length -1] == maxx)
//         {
//             bb[nums.length - 1] = -1;
//         }
//         else
//         {
//             bb[nums.length -1 ] = maxx;
//         }
//         return bb;
//     }
// }