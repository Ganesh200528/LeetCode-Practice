class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
        {
            return -1;
        }
        int i = 0; 
        int j = haystack.length();
        int kk = needle.length();
        // while(kk == j)
        // {
        //     String ss = haystack.substring(i,kk);
        //     if(ss.equals(needle))
        //     {
        //         return i;
               
        //     }
        // }
        while(kk <= j)
        {
            String ss = haystack.substring(i,kk);
            if(ss.equals(needle))
            {
                return i;
               
            }
            i++;
            kk++;

        }
 
    return -1;
    }
}























//         // int kk = 0;
//         // for(int i = 0; i < haystack.length();i++)
//         // {
//         //     int j = 0;
//         //     while(needle.chaAt(j) == haystack.charAt(i))
//         //     {
//         //         kk = j;
//         //         j++;
//         //         i++;
//         //     }
//         // }
//     }
// }