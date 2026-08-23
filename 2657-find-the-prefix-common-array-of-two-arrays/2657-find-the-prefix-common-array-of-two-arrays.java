
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       ArrayList<Integer> gg = new ArrayList<>();
       int[] ff = new int[A.length];
       int n = 1;
       int temp = 0;
       for(int i = 0; i < n;i++)
       {
            gg.add(A[i]);
            for(int j = 0; j < n;j++)
            {
                if(gg.contains(B[j]))
                {
                    temp++;
                }
            }
            
            if(n < A.length)
            {
                n++;
            }
            ff[i] = temp;
            temp = 0;
       }
      return ff;
    }
}