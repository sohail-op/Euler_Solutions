package codex;
/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class q10 {
	public static boolean isPrime(int n) 
    {
		for(int i=2;i*i<=n;i++) 
        {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
    {
	
		int limit=2000000;
		long sum=0;
		for(int i=2;i<limit;i++) 
        {
			if(isPrime(i)) 
            {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}