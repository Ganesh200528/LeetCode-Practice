import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = heights.length;

        Integer[] sortedHeights = new Integer[n];

        // Copy heights
        for (int i = 0; i < n; i++) {
            sortedHeights[i] = heights[i];
        }

        // Sort heights in descending order
        Arrays.sort(sortedHeights, Collections.reverseOrder());

        String[] answer = new String[n];

        // Find the name for each sorted height
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (sortedHeights[i] == heights[j]) {
                    answer[i] = names[j];
                    break;
                }
            }
        }

        return answer;
    }
}