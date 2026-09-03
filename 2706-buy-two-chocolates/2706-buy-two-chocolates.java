class Solution {
    public int buyChoco(int[] prices, int money) {
        
        PriorityQueue<Integer> qq = new PriorityQueue<>((a,b) -> (a - b));
        for(int i = 0; i < prices.length;i++)
        {
            qq.add(prices[i]);
        }

        int yy = money;
        int kk = 0;
        for(int i = 0; i < 2;i++)
        {
           money -= qq.poll();
        }
         if(money < 0)
           {
            return yy;
           }
         if(money == 0)
           {
            return 0;
           }
        return money;
    }

}