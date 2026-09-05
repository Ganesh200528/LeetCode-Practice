import java.util.*;

class Solution {
    public String[] findWords(String[] words) {

        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";

        List<String> aa = new ArrayList<>();

        for (String word : words) {

            String lower = word.toLowerCase();

            boolean valid = true;

            String row;

            if (one.contains(String.valueOf(lower.charAt(0)))) {
                row = one;
            } 
            else if (two.contains(String.valueOf(lower.charAt(0)))) {
                row = two;
            } 
            else {
                row = three;
            }

            for (char ch : lower.toCharArray()) {
                if (!row.contains(String.valueOf(ch))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                aa.add(word);
            }
        }

        return aa.toArray(new String[0]);
    }
}