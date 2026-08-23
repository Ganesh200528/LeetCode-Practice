class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n = height.length;
        ArrayList<Integer> gg = new ArrayList<>(); 
        for(int i = 0; i < n-1;i++)
        {
            if(height[i] > threshold)
            {
                gg.add(i+1);
            }
        }
        return gg;
    }
}