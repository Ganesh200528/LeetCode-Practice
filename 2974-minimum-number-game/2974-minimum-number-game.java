class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int[] gg = new int[nums.length];
        for(int i : nums)
        {
            p.add(i);
        }
        int a = 0;
        int b = 0;
        int x = 0;
        for(int i= 0 ; i < nums.length/2;i++)
        {
            a = p.poll();
            b = p.poll();
            gg[x] = b;
            x++;
            gg[x] = a;
            x++;
        }

      return gg;  
    }
}