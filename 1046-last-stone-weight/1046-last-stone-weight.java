class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> qq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
       for(int k : stones)
       {
        qq.add(k);
       } 
       
       while(qq.size() > 1)
       {
        int gg = 0;
        gg = qq.poll() - qq.poll();
        qq.add(gg);
       }

       return qq.poll();
    }
}