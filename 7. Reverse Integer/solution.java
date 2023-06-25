class Solution 
{
     public int reverse(int x) 
    {
        int copy = x;
        x = Math.abs(x);
        int len = (int) Math.log10(x) + 1;
        long rev = 0;
        while (x != 0) 
        {
            int d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }

        if (copy < 0)
            copy = (int) rev * -1;
        else
            copy = (int) rev;
      //  System.out.println(rev);
        if (x > Math.pow(-2, 31) && x < (Math.pow(2, 31) - 1)) 
        {
            if (len <= 10 && rev < (Math.pow(2, 31) - 1)  && rev> (Math.pow(-2, 31)) )
                return copy;
            else
                return 0;
        } 
        else
            return 0;
    }
}