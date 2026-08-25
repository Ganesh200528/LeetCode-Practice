class Solution {
    public long pickGifts(int[] gifts, int k) {
      PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
      for(int i : gifts)
      {
        p.add(i);
      }  
      int x = 0;
      int y = 0;
      for(int i = 0; i < k;i++)
      {
            x = p.poll();
            y = (int)Math.sqrt(x);
            p.add(y);
      }
        long u = 0;
      for(int j = 0; j < gifts.length;j++)
      {
         u += p.poll();

      }
      return u;
    }
}