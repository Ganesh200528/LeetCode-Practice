class Solution {
    public int minimumSum(int num) 
    {
        String gg = String.valueOf(num);
         StringBuilder ss = new StringBuilder();
         StringBuilder kk = new StringBuilder();
        Integer[] arr = new Integer[4];
        for(int i = 0; i < gg.length();i++)
        {
           arr[i] = gg.charAt(i) - '0';
        }
        Arrays.sort(arr);
        ss.append(arr[0]);
        ss.append(arr[2]);
        kk.append(arr[1]);
        kk.append(arr[3]);
        int hh = Integer.valueOf(ss.toString());
        int qq = Integer.valueOf(kk.toString());
        return hh+qq;
    }
}