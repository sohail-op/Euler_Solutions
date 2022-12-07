package codex;
/*

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class q4 
{
    public static boolean pali(long num) {
		String x=num+"";
		StringBuilder sb=new StringBuilder(x);
		String st=sb.reverse().toString();
		if(x.equals(st))
			return true;
		return false;
	}
	public static void main(String[] args) 
    {
		long max=Long.MIN_VALUE;
		for(int i=100;i<=999;i++) 
        {
			for(int j=100;j<=999;j++) 
            {
				if(pali(i*j))
                {
					max=Math.max(max, i*j);
				}
			}
		}
		System.out.println("the largest palindrome made from the product of two 3-digit numbers is "+max);
	}

}    
