package codex;
public class q3 
{
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
		long num=600851475143l;
		int primenumber=2;
		long max=Long.MIN_VALUE;
		while(num>1) 
    {
			max=Math.max(max, primenumber);
			while(num%primenumber==0) 
      {
				num=num/primenumber;
			}
			primenumber++;
			while(!isPrime(primenumber)) 
      {
				primenumber++;
			}
		}
		System.out.println(max);
	}

}
