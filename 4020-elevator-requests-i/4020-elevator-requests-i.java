class Solution {
    public int elevatorRequests(int n, int[] requests) {
        
        int ans = 0;
        int kk = 0;
        for(int i = 1; i < requests.length;i++)
        {
            
            ans =  Math.abs(requests[i]-requests[i-1]);
            kk += ans;
        }
        return kk+requests[0];
    }
}