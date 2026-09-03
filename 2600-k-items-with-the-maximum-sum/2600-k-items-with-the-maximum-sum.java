class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int kk = numOnes+numZeros;
        int xx;
        int yy;
        if(numOnes > k)
        {
            return k;
        }
        else if ( kk > k)
        {
            return numOnes;
        }
        else
        {
            xx= k-kk;
            yy = numOnes+(xx*-1);
        }
        return yy;

    }
}