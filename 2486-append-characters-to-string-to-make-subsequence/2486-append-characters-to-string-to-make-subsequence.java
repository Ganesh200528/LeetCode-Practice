class Solution {
    public int appendCharacters(String s, String t) {

        int j = 0;

        for (int i = 0; i < s.length() && j < t.length(); i++) {

            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
        }

        return t.substring(j).length();
    }
}













// class Solution {
//     public int appendCharacters(String s, String t) 
//     {
//         int i = t.length();
//         int kk = 0;
//         while(0 <= i-1)
//         {
//             if(s.contains(t.substring(0,i)))
//             {
//                 kk = i;
//                 break;
//             }
//             i--;

//         }
//         return t.length() - i;
//     }
// }