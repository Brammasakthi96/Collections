  //2.ADD 5 INTEGER VALUES INTO AN ARRAYLIST AND FIND THEIR SUM

package nithi;
import java.util.ArrayList;

public class ques2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		int sum=0;
		for(int i :num)
		{
			sum=sum+i;
		}
		System.out.println("The numbers: "+num);
		System.out.println("Sum= "+sum);
	

	}

}
