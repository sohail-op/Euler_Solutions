package codex;
/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
 */
import java.util.*;
public class q7 
{
	int lim=10000000;
	boolean[] arr=new boolean[lim+1];
    public void sieve() {
    	int cnt=0;
    	int var=-1;
    	for(int i=2;i<=lim;i++)
    		arr[i]=true;
    	for(int i=2;i*i<=lim;i++) 
        {
    		if(arr[i]==true) 
            {
        		for(int j=i*i;j<=lim;j+=i) 
                {
        			arr[j]=false;
        		}    			
    		}
    	}
		for(int i=2;i<=lim;i++) 
        {
			if(arr[i]==true) 
            {
				cnt++;
			}
			if(cnt==10001) 
            {
				var=i;
				System.out.println(var);
				break;
			}
		}
    }
	public static void main(String[] args) 
    {
		q7 t=new q7();
		t.sieve();
	}

}
