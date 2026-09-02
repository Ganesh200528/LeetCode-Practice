import java.util.*;

class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> hh = new HashMap<>();
        char tt = ' ';

      
        for (char g : s.toCharArray()) {
            hh.put(g, hh.getOrDefault(g, 0) + 1);
        }

     
        for (char j : t.toCharArray()) {

            if (!hh.containsKey(j) || hh.get(j) == 0) {
                tt = j;
                break;
            }

            hh.put(j, hh.get(j) - 1);
        }

        return tt;
    }
}




// class Solution {
//     public char findTheDifference(String s, String t) {
//         StringBuilder ss = new StringBuilder();
//         HashSet<Character> hh = new HashSet<>();
//         char tt = ' ';
//          int n = 1;
//         for(char g:s.toCharArray())
//         {
//             hh.add(g);
//         }
//         for(char j:t.toCharArray())
//         {   
           
//            if(!hh.contains(j))
//             {
//                 tt = j;
//             }
//             if(hh.contains(j))
//             {
//                 n++;
//                 if(n == t.length())
//                 {
//                     tt = j;
//                 }
//             }
//             // if(!hh.contains(j))
//             // {
//             //     tt = j;
//             // }


//         }
//      return tt;
//     }
// }