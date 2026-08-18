import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        int temp = 0;

        while (n != 1) {
            
            if (set.contains(n)) {
                return false;
            }

            set.add(n);

            String s = String.valueOf(n);

            for (int i = 0; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                temp += digit * digit;
            }

            n = temp;   
            temp = 0;   
        }

        return true;
    }
}