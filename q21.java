package codex;
/*

Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */

public class q21 
{
  static int div_sum(int n)
  {
    int sum=0,m=n/2;
    for(int i =1;i<=m;i++)
    {
      if(n%i==0)
      {
        sum+=i;
      }
    }
    return sum;
  }
  public static void main(String[] args) 
  {
    int a,b,c,sum=0;
    for(int i=1;i<=10000;i++)
    {
       a= div_sum(i);
       c=a;
       b= div_sum(c);
      if(i==b && c==a)//i=first_num,b=sum_of_sec_num,c=sec_num,a=sum_of_first_num
      sum+=i;
        
    }
    System.out.println("the sum of all the amicable numbers under 10000 is "+sum);
  }
}
