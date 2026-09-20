class Solution {
    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        int first = -1;
        int second = -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                count++;

                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                }
            }
        }

 
        if (count == 0) {
            HashMap<Character, Integer> hh = new HashMap<>();

            for (char c : s.toCharArray()) {
                hh.put(c, hh.getOrDefault(c, 0) + 1);

                if (hh.get(c) > 1) {
                    return true;
                }
            }

            return false;
        }

        if (count == 1) {
            return false;
        }

 
        if (count > 2) {
            return false;
        }

        return s.charAt(first) == goal.charAt(second)
            && s.charAt(second) == goal.charAt(first);
    }
}






















// class Solution {
//     public boolean buddyStrings(String s, String goal) 
//     {
//         int ans = 0;
//         for(int i = 0; i < s.length();i++)
//         {
//             if(s.charAt(i) != goal.charAt(i))
//             {
//                 ans++;
//             }
//         }
//         if( ans == 1 || ans == 2)
//         {
//             return true;
//         }
//         HashMap<Character,Integer> hh = new HashMap<>();
//         for(int i = 0; i < s.length();i++)
//         {
//             hh.put(s.charAt(i),hh.getOrDefault(s.charAt(i),0)+1);
//         }

//         for(char jj : hh.keySet())
//         {
//             if(hh.get(jj) > 1)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }