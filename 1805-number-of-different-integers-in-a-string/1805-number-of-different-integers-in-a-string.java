class Solution {
    public int numDifferentIntegers(String word) {

        HashSet<String> hh = new HashSet<>();
        StringBuilder ss = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            if (Character.isDigit(word.charAt(i))) {
                ss.append(word.charAt(i));
            } 
            else {
                if (!ss.isEmpty()) {

                    // Remove leading zeros
                    String num = ss.toString().replaceFirst("^0+", "");

                    // If number is only zeros
                    if (num.isEmpty()) {
                        num = "0";
                    }

                    hh.add(num);
                    ss.setLength(0);
                }
            }
        }

        // Process last number
        if (!ss.isEmpty()) {

            String num = ss.toString().replaceFirst("^0+", "");

            if (num.isEmpty()) {
                num = "0";
            }

            hh.add(num);
        }

        return hh.size();
    }
}






















// class Solution {
//     public int numDifferentIntegers(String word) {
//        HashSet<Integer> hh = new HashSet<>();
//        ArrayList<Character> aa = new ArrayList<>();
       
       
//        for(int i = 0; i <= 9 ;i++)
//        {
//         aa.add((char)('0'+i));
        
//        }
//        StringBuilder ss = new StringBuilder();
//         for(int i = 0; i < word.length();i++)
//         {
            
//             if(aa.contains(word.charAt(i)))
//             {
//                 ss.append(word.charAt(i));
//             }
//             else
//             {
//                 if(!ss.isEmpty())
//                 {
//                 hh.add(Integer.parseInt(ss.toString()));
//                 ss.setLength(0);
//                 }
//             }
//         }
//          if (!ss.isEmpty()) {
//             hh.add(Integer.parseInt(ss.toString()));
//         }

//         return hh.size();
//     }
// }