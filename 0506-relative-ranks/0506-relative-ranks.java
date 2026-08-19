import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] index = new Integer[n];

        for(int i = 0; i < n; i++)
        {
         index[i] = i;
        }

        Arrays.sort(index,(a,b)-> score[b] - score[a]);
        String[] answer = new String[n];

        for(int j = 0; j < n ;j++)
        {
            int hh = index[j];
            if(j == 0)
            {
                answer[hh] = "Gold Medal";
            }
            else if(j == 1)
            {
                answer[hh] = "Silver Medal";
            }
            else if(j == 2)
            {
                answer[hh] = "Bronze Medal";
            }
            else
            {
                answer[hh] = String.valueOf(j + 1);

            }
        }
        return answer;
    }
}