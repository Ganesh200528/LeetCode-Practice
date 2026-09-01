class Solution {
    public int lengthOfLastWord(String s) {


    String[] arr = s.split(" ");

        System.out.println(Arrays.toString(arr));

        int gg = arr[arr.length-1].length();
        return gg;
    }
}
        // for(int i = 0; i < s.length();i++)
        // {
            
        // }

        // StringBuilder ss = new StringBuilder();
        // HashSet<Character> hh = new HashSet<>();
        // for(int i = s.length() -1 ; i > 0;i-- )
        // {
        //     if(s[i] != ' ' || ss.size() != )
        //     {
        //         ss.add(s[i]);
        //     }
        // }
//     }
// }