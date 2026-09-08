class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int minn = Math.min(players.length,trainers.length);
        int ans = 0;
        int j = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        for(int i = 0; i < players.length;i++)
        {


            while(j < trainers.length)
            {
                 if( players[i] <= trainers[j])
                {
                    ans++;
                    j++;
                    break;
                }
                j++;
            }
            // for(int j = 0 ; j < trainers.length ;j++)
            // {
            //     if( players[i] <= trainers[j])
            //     {
            //         ans++;
            //         break;
            //     }
            // }
        }
        minn = Math.min(minn,ans);
        return minn;
    }
}