import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> hh = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                hh.remove(hh.size() - 1);
            }
            else if (operations[i].equals("D")) {
                hh.add(hh.get(hh.size() - 1) * 2);
            }
            else if (operations[i].equals("+")) {
                hh.add(hh.get(hh.size() - 1) + hh.get(hh.size() - 2));
            }
            else {
                hh.add(Integer.parseInt(operations[i]));
            }
        }

        int ans = 0;

        for (int j : hh) {
            ans += j;
        }

        return ans;
    }
}