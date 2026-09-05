import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) 
    {
          StringBuilder ss = new StringBuilder();
          ss.append(number);
          BigInteger maxx = BigInteger.ZERO ;
          for(int i = 0; i < number.length();i++)
          {
            if(number.charAt(i) == digit)
            {
                ss.deleteCharAt(i);
            BigInteger value = new BigInteger(ss.toString());

                if(value.compareTo(maxx) > 0)
                {
                    maxx = value;
                }
            ss.insert(i,digit);
            }
          }
        return String.valueOf(maxx);
    }
}