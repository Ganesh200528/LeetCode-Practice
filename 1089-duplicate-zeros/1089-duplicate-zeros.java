class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> gg = new ArrayList<Integer>();
        int n = arr.length;
        for(int i = 0; i < n;i++)
        {
            if(arr[i] == 0)
            {
                gg.add(0);
                gg.add(0);
            }
            else
            {
                gg.add(arr[i]);
            }
        }
        for(int x = 0; x < n; x++)
        {
            arr[x] = gg.get(x);
        }
    }
}