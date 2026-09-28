  //4.FIND THE SMALLEST ELEMENT IN AN ARRAYLIST

package nithi;
import java.util.ArrayList;
public class ques4 {
	public static void main(String[] args) 
	{
		ArrayList<Integer>num=new ArrayList<>();
		num.add(35);
		num.add(-3);
		num.add(7);
		num.add(400);
		num.add(52);
		int small=num.get(0);
		for (int i:num)
		{
			if(i<small)
			{
				small=i;
			}
		}
		System.out.println("The numbers: "+num);
		System.out.println("The smallest number: "+small);
	}
}
