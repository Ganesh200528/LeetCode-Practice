class Solution 
    
{
    public static int  RightMost(int[] nums,int a)
    {
        int  r= nums.length -1;
        int  l = 0;
        while(l <= r)
        {
            int mid = l+(r-l)/2;
            if(nums[mid]> a)
            {
                r = mid -1;
            }
            else
            {
                l = mid + 1;
            }
        }
        if(r < 0 || nums[r] != a  )
        {
            return -1;
        }
        
        return r;


    }
    public static int  LeftMost(int[] nums,int a)
    {
        
        int  r= nums.length -1;
        int  l = 0;
        while(l <= r)
        {
            int mid = l + (r-l)/2;
            if (nums[mid] < a)
            {
                l = mid+1;
            }
            else
            {
                r = mid -1;
            }
        }
        if( l >= nums.length || nums[l] != a )
        {
            return -1;
        }
       
        return l;
    }

   
    
    public int[] searchRange(int[] nums, int target)
    {   
        int aa = 0;
        int bb = 0;

        if(nums.length == 0)
        {
             aa = -1;
             bb = -1;
        }
        else
        {
         aa = LeftMost(nums,target);
         bb = RightMost(nums,target);
        }
        int[] gxg = {aa,bb};
        return gxg;
    }
}