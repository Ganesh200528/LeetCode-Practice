class Solution {
    public int[] separateDigits(int[] nums) {
      
       List<Integer> ll = new ArrayList<>();
       for(int i = 0 ; i < nums.length;i++)
       {
        String gg = String.valueOf(nums[i]);
        for(char cc : gg.toCharArray())
        {
            ll.add(cc - '0');
        }
       }  
       int[] pp = new int[ll.size()];
       int yy = 0;
       for(int gg : ll)
       {
        pp[yy] = gg;
        yy++;
       }
        return pp;
    }
}