class Solution {
    public String convertToTitle(int columnNumber) 
    {
        int xx = 0;
        int yy = 0;
       HashMap<Integer,Character> hh = new HashMap<>();
       String kk = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
       StringBuilder ss = new StringBuilder();
        for(int i = 0; i < 26;i++)
        {
            hh.put(i,hh.getOrDefault(i,kk.charAt(i)));
        }

        while ( columnNumber > 0)
        {
           xx = columnNumber - 1;
           yy = xx%26;
           ss.append(hh.get(yy));
            columnNumber =xx / 26;
            //xx = columnNumber - 1;
        }

        return ss.reverse().toString();
    }
}





        // HashMap<Integer,Character> hh = new HashMap<>();
        // String kk = "1ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // int y = 0;
        // int yy = 0;
        // int xx = 0;
        // StringBuilder ss = new StringBuilder();
        // for(int i = 1; i <= 26;i++)
        // {
        //     hh.put(i,hh.getOrDefault(i,kk.charAt(i)));

        // }
        // if(26 >= columnNumber)
        // {
        //     return String.valueOf(hh.get(columnNumber));
        // }
        // else
        // {
        //     y = columnNumber/26;
        //     if(y <= 26)
        //     {
        //         xx = 1;
        //     }
        //     else
        //     {
        //             xx = y/26;
        //     }

        //     for(int l = 0; l < xx ;l++)
        //     {
        //         ss.append(String.valueOf(hh.get(y)));
        //     }
        //     yy = columnNumber%26;
        //     ss.append(String.valueOf(hh.get(yy)));
            

        // }
        // return ss.toString();
//     }
// }