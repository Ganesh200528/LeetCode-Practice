class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        
        int gg = maxWeight/w;

        int hh = n*n;
        int minn = Math.min(gg,hh);
        return minn;
    }
}