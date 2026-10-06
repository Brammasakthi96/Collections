/*RECURSIVE METHOD IS CALLING ITSELF AND ITS MUST HAVE
    STOPPING CONDITIION,OTHERWISE TI WILL KEEP CALLING ITSELF*/
package nithi;
public class recursive 
{
	static void count(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);
		count(n-1);
	}
	public static void main(String[] args) 
	{
		count(10);
		
	}

}
