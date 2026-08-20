class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp = "";
        String temp1 = "";
        for(int i =0;i < word1.length;i++)
        {
            temp += word1[i];
        }
        for(int j = 0; j < word2.length;j++)
        {
            temp1 += word2[j];
        }
        if(temp.equals(temp1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}