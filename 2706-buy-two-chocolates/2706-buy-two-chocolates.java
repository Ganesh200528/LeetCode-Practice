class Solution {
    public int buyChoco(int[] prices, int money) {
        
        Arrays.sort(prices);
        int yy = money;
        int kk = 0;
        for(int i = 0; i < 2;i++)
        {
           money = money - prices[i];
           
          
          
          
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