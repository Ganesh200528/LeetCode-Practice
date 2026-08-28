class Solution {
    public boolean lemonadeChange(int[] bills) {
        //int acc = 0;
        int xx = 0;
        int uu = 0;
        int kk = 0;
        ArrayList<Integer> gg = new ArrayList<>();
        for(int i = 0; i < bills.length;i++)
        {
            if(bills[i] == 5)
            {
                gg.add(bills[i]);
            }
            else if( bills[i] > 5)
            {
                gg.add(bills[i]);
                xx   =bills[i] - 5;
                uu = (xx/10)*10;
                kk = xx % 10;
                if(uu != 0 )
                {
                    if(gg.contains(uu))
                    {
                gg.remove(Integer.valueOf(uu));
                    }
                    else
                    {
                        int ll = uu/5;
                        for(int il = 0; il < ll;il++)
                        {
                            if(!gg.contains(5))
                            {
                                return false;
                            }
                            else
                            {
                                 gg.remove(Integer.valueOf(kk));
                            }
                        }
                    }
                    
                }
                if(kk != 0)
                {
                    if(!gg.contains(kk))
                    {
                        return false;
                    }
                    else
                    {
                    gg.remove(Integer.valueOf(kk));
                    }
                }
                
                
            }
        }
        return true;
    }
}


        
//         for(int i = 0; i < bills.length;i++)
//         {
//             if(bills[i] == xx)
//             {
//                 acc += 5;
//             }
//             else if (bills[i] > 5)
//             {
//                 xx = bills[i] - xx;

//                 if(acc% xx != 0 || acc < xx)
//                 {
//                     return false;
//                 }
//                 else
//                 {
//                     acc = acc-xx+5;
//                     xx =5;
//                 }
                

//             }

//         }
//         return true;
//     }
// }