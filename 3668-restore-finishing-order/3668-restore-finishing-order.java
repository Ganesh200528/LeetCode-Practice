class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        int nn = friends.length;
        int[] gg = new int[nn];
        int x = 0;
        for(int i =0 ; i < n; i++)
        {
            for(int j = 0; j < nn;j++)
            {
                if(order[i] == friends[j])
                {
                    gg[x] = order[i];
                    x++;
                }
            }
        }
        return gg;
    }
}