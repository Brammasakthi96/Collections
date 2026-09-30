  //INTERVIEW QUES 7. FIND THE MAXIMUM VALUE IN A COLLECTION

package nithi;
import java.util.HashSet;
public class invw7 {
	public static void main(String[] args) 
	{
		HashSet<Integer>num=new HashSet<>();
		num.add(50);
		num.add(20);
		num.add(200);
		num.add(40);
		num.add(14);
		System.out.println("FIND  THE MAXIMUM VALUE IN A COLLECTION");
		System.out.println("The numbers: "+num);
		int max=0;
	    max=Integer.MIN_VALUE;
		for(int n:num)
		{
			if(n > max)
			{
				max=n;
			}
		}
		System.out.println("The maximum value: "+max);
	}
}
