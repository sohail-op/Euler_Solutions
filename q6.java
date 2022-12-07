package codex;
/*Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

public class q6 {
	public static void main(String[] args)
    {
		int sum=0;
		int sumsquare=0;
		for(int i=1;i<=100;i++)
        {
			sum+=i;
			sumsquare+=(int) Math.pow(i, 2);
		}
		System.out.println((int)Math.pow(sum,2)-sumsquare);
	}
}